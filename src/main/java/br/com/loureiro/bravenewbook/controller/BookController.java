package br.com.loureiro.bravenewbook.controller;

import br.com.loureiro.bravenewbook.domain.model.Book;
import br.com.loureiro.bravenewbook.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping("/book/v1/book")
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
