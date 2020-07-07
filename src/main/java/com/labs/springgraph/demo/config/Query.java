package com.labs.springgraph.demo.config;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.labs.springgraph.demo.model.Author;
import com.labs.springgraph.demo.model.Book;
import com.labs.springgraph.demo.model.Tutorial;
import com.labs.springgraph.demo.repository.AuthorRepository;
import com.labs.springgraph.demo.repository.BookRepository;
import com.labs.springgraph.demo.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Query implements GraphQLQueryResolver {

    private AuthorRepository authorRepository;
    private TutorialRepository tutorialRepository;
    private BookRepository bookRepository;

    @Autowired
    public Query(AuthorRepository authorRepository, TutorialRepository tutorialRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.tutorialRepository = tutorialRepository;
        this.bookRepository = bookRepository;
    }

    public Iterable<Tutorial> findTutorialsByAuthorId(Long idAuthor){
        return tutorialRepository.findTutorialsByAuthorId(idAuthor);
    }

    public Iterable<Book> findAllBook(){
        return bookRepository.findAll();
    }

    public Optional<Book> findBookById(Long id){
        return bookRepository.findById(id);
    }

    public List<Book> findBooksByIds(List<Long> id){
        return bookRepository.findAllById(id);
    }

    public Optional<Author> findAuthorById(Long id){
        return  authorRepository.findById(id);
    }

    public List<Author> findAuthorsByIds(List<Long> id){
        return authorRepository.findAllById(id);
    }

    public Iterable<Author> findAllAuthors(){
        return authorRepository.findAll();
    }

    public Iterable<Tutorial> findAllTutorials(){
        return tutorialRepository.findAll();
    }

    public long countAuthors(){
        return tutorialRepository.count();
    }

    public long countTutorials(){
        return tutorialRepository.count();
    }

}
