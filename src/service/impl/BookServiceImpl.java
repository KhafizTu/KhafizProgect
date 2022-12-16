package service.impl;

import enums.Genre;
import enums.Language;
import model.Book;
import service.BookService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookServiceImpl implements BookService {

    List<Book> books = new  ArrayList<>();


    @Override
    public List<Book> createBooks(List<Book> books) {
        return books;
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }

    @Override
    public String getBooksByGenre(String genre) {
        return genre;
    }

    @Override
    public Long removeBookById(Long id) {
        return null;
    }

    @Override
    public List<Book> sortBooksByPriceInDescendingOrder() {
        Comparator<Book> sortByName = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPrice().compareTo(o2.getPrice());
            }

        }; return (List<Book>) sortByName;
    }

    @Override
    public List<Book> filterBooksByPublishedYear() {
        return null;
    }

    @Override
    public List<Book> getBookByInitialLetter() {
        return null;
    }

    @Override
    public Book maxPriceBook() {
        return null;
               // Integer max = (Integer) Collections.max(books);
      //  System.out.println("ArrayList values : " + books);
       // System.out.println("ArrayList max value : " + max);;
    }
}
