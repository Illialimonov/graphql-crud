package com.example.ilia.ghaphql;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class GraphqlApplication {
    public static void main(String[] args) {
        SpringApplication.run(GraphqlApplication.class);
    }

//    @Bean
//    ApplicationRunner applicationRunner(AuthorRepository authorRepository, BookRepository bookRepository){
//        return args -> {
//            Author josh = authorRepository.save(new Author(null,"Josh Long"));
//            Author mark = authorRepository.save(new Author(null,"mark twain"));
//            bookRepository.saveAll(List.of(
//                    new Book(null,"Harry potter", "publisher", josh),
//                    new Book(null,"Weird potter", "publisher", mark),
//                    new Book(null,"Sad potter", "publisher", josh)
//
//            ));
//        };
//    }
}
