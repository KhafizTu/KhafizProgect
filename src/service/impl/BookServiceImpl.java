package service.impl;

import enums.Genre;
import enums.Language;
import model.Book;
import service.BookService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class BookServiceImpl implements BookService {

    List<Book> books = new  ArrayList<>();





    @Override
    public List<Book> createBooks(List<Book> books) {
        this.books.addAll(books);
        return this.books;
    }

    @Override
    public List<Book> getAllBooks() {
        System.out.println();
        return this.books;
    }

    @Override
    public List<Book>  getBooksByGenre(String genre) {
        List<Book> books1 = new ArrayList<>();
        for (Book book:this.books) {
            if (Genre.valueOf(genre).equals(book.getGenre())){
                books1.add(book);
            }
        }
        System.out.println();
        return books1;
    }

    @Override
    public Book removeBookById(Long id) {
        return null;
    }

    @Override
    public List<Book> sortBooksByPriceInDescendingOrder() {
        List<Book> books1 = this.books.stream().sorted(Comparator.comparing(Book::getPrice)).toList();
        System.out.println();
       return books1;
    }

    @Override
    public List<Book> filterBooksByPublishedYear() {
        List<Book> books1 = new ArrayList<>();
        for (Book book:this.books) {
            int period = Period.between(LocalDate.now(),book.getPublishedYear()).getYears();
            if (period<10){
                books1.add(book);
                System.out.println();
                return  books1;
            }

        }
        return null;
    }

    @Override
    public List<Book> getBookByInitialLetter() {
        List<Book> b ;
        b = this.books.stream().filter(m -> m .getName().substring(0,1).equalsIgnoreCase("a")).toList();
        System.out.println();
        return b;
    }

    @Override
    public Optional<Book> maxPriceBook() {
        System.out.println();
        return this.books.stream().max(Comparator.comparing(Book::getPrice)).stream().findFirst();

    }
}
