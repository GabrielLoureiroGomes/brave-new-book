package br.com.loureiro.bravenewbook.repository;

import br.com.loureiro.bravenewbook.domain.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository {

    List<Book> findAll();

    Book findByName();

}
