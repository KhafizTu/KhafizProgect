package model;

import enums.Gender;

import java.math.BigDecimal;
import java.util.List;


public class User {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private Gender gender;
    private BigDecimal money;
    private List<Book> books;

}
