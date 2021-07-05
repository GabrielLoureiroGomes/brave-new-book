package br.com.loureiro.bravenewbook.database;

import br.com.loureiro.bravenewbook.domain.model.Book;
import br.com.loureiro.bravenewbook.repository.BookRepository;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepositoryImpl implements BookRepository {

    String connectionUrl = "jdbc:mysql://localhost:3306/brave_new_book?serverTimezone=UTC";
    Connection conn = getDatabaseConnection();

    public Connection getDatabaseConnection() {
        try {
            conn = DriverManager.getConnection(connectionUrl, "root", "gj07092018$");
        } catch (SQLException e) {
            e.getCause();
        }
        return conn;
    }

    @Override
    public List<Book> findAll() {

        List<Book> books = new ArrayList<>();

        try {
            PreparedStatement ps = conn.prepareStatement("SELECT NAME, PUBLISHING_COMPANY, PUBLICATION_YEAR, AUTHOR FROM BOOK");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Book book = new Book();
                book.setName(rs.getString("NAME"));
                book.setPublishingCompany(rs.getString("PUBLISHING_COMPANY"));
                book.setPublicationYear(rs.getInt("PUBLICATION_YEAR"));
                book.setAuthor(rs.getString("AUTHOR"));

                books.add(book);
            }
        } catch (SQLException e) {
            e.getCause();
        }
        return books;
    }

    @Override
    public Book findByName() {
        return null;
    }
}
