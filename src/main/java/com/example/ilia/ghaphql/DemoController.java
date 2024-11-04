package com.example.ilia.ghaphql;

import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@AllArgsConstructor
public class DemoController {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    @QueryMapping
    List<Author> authors() {
        return authorRepository.findAll();
    }

    @QueryMapping
    Author authorById(@Argument Long id) {
        return authorRepository.findById(id);
    }

    @QueryMapping
    List<Book> books() {
        return bookRepository.findAll();
    }

    @MutationMapping
    Book addBook(@Argument BookInput book){
        Author author = authorRepository.findById(book.authorId());
        Book b = new Book(book.title, book.publisher(), author);
        return bookRepository.save(b);
    }

    record BookInput(String title, String publisher, Long authorId){}

}
