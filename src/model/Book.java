package model;


import enums.Genre;
import enums.Language;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Book {
    private Long id;
    private String name;
    private Genre genre;
    private BigDecimal price;
    private String author;
    private Language language;
    private LocalDate publishedYear;


}
