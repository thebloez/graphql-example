package com.labs.springgraph.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "book_title")
    private String bookTitle;

    @ManyToOne
    @JoinColumn(name = "id_tutor", nullable = false, updatable = false)
    private Tutorial tutorial;

    public Book() {
    }

    public Book(Long id, String bookTitle, Tutorial tutorial) {
        this.id = id;
        this.bookTitle = bookTitle;
        this.tutorial = tutorial;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookTitle='" + bookTitle + '\'' +
                ", tutorial=" + tutorial +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public Tutorial getTutorial() {
        return tutorial;
    }

    public void setTutorial(Tutorial tutorial) {
        this.tutorial = tutorial;
    }
}
