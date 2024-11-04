package com.example.ilia.ghaphql;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor

public class Author {
    @Id
    @GeneratedValue
    private Long id;

    public Author(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Author() {
    }

    private String name;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Book> books = new ArrayList<>();
}
