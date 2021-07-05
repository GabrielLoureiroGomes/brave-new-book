package br.com.loureiro.bravenewbook.domain.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;


@Getter
@Setter
public class BookEntity {

    @Id
    private Long id;
    private String name;
    private String publishingCompany;
    private int publicationYear;
    private String author;

}
