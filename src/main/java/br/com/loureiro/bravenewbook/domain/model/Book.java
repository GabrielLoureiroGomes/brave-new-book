package br.com.loureiro.bravenewbook.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {

    private String name;
    private String publishingCompany;
    private int publicationYear;
    private String author;

}
