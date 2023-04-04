import enums.Gender;
import enums.Genre;
import enums.Language;
import model.Book;
import model.User;
import service.UserService;
import service.impl.BookServiceImpl;
import service.impl.UserServisImpl;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Бардык Id лер уникальный болуш керек. Эгер уникальный болбосо озубуз тузгон UniqueConstraintException класс ыргытсын.
        // User дин email адресси уникальный болуш керек жана @ болуусу керек. Эгер уникальный болбосо UniqueConstraintException класс,
        // @ болбосо озубуз тузгон BadRequestException класс ыргытсын.
        // User дин телефон номери +996 дан башталып 13 символдон турсун. Болбосо BadRequestException класс ыргытсын.
        // Китептин баасы терс сан болбошу керек. Болбосо NegativeNumberException ыргытсын.
        // Китептин чыккан жылы келечек убакыт болбошу керек.Болбосо DateTimeException ыргытсын.
        // Китептин автору бош болбошу керек. Болбосо EmptyStackException ыргытсын.


        BookServiceImpl bookService = new BookServiceImpl();


List<Book>books = new ArrayList<>(List.of(
        new Book(Long.decode("12"), "Mир Жевотных", Genre.FANTASY, new BigDecimal(100), "Чарли Дюмуа", Language.ENGLISH, LocalDate.ofYearDay(1957, 12)),
        new Book(Long.decode("23"), "Война и Мир", Genre.HISTORICAL, new BigDecimal(200), "Лев Толстой", Language.RUSSIAN, LocalDate.ofYearDay(1869, 10)),
        new Book(Long.decode("375"), "Жизнь после смерти", Genre.FANTASY, new BigDecimal(300), "Алекс Мёрти", Language.ENGLISH, LocalDate.ofYearDay(1957, 24)),
        new Book(Long.decode("82"), "Гарри Потер", Genre.FANTASY, new BigDecimal(400), "Джоан Роулинг", Language.ENGLISH, LocalDate.ofYearDay(2001, 9)),
        new Book(Long.decode("67"), "Сила Разума", Genre.ROMANCE, new BigDecimal(500), "Николаичева Екатерина ", Language.ENGLISH, LocalDate.ofYearDay(2010, 18))));


List<User> users = new ArrayList<>(List.of(
         new User(Long.decode("123"),"Khafiz","Turusbek uulu","khafiz@gmail.com","+996501167662", Gender.MALE,new BigDecimal(12000),books),
         new User(Long.decode("645"),"Bekjan","Jakanov","bekjan@gmail.com","+996507267753", Gender.MALE,new BigDecimal(8000),books),
         new User(Long.decode("123"),"Aziza","Samatova","aziza@gmail.com","+996700491871", Gender.FEMALE,new BigDecimal(1234),books)));


            System.out.println();
            System.out.println(bookService.createBooks(books));
            System.out.println("Баардык буктарды чыгарат:");
            System.out.println(bookService.getAllBooks());
            System.out.println("Бир жанр дагы китептер: ");
            System.out.println(bookService.getBooksByGenre("FANTASY"));

            //System.out.println(bookService.getBookByInitialLetter());

            System.out.println("Кымбат китеп: ");
            System.out.println(bookService.maxPriceBook());
            System.out.println("Жылын чыгаруу: ");
            System.out.println(bookService.filterBooksByPublishedYear());

        System.out.println("USER: ");

        UserServisImpl userServis = new UserServisImpl();

        System.out.println();
        System.out.println(userServis.createUser(users));
        System.out.println("All User: ");
        System.out.println(userServis.findAllUsers());
        System.out.println("User Name: ");
        System.out.println(userServis.removeUserByName("Khafiz"));
        System.out.println("Book Name: ");
        System.out.println(userServis.buyBooks("Война и Мир", books));
        System.out.println("Gender: ");
        userServis.groupUsersByGender();
        System.out.println("sasasasa");
        System.out.println(books.get(0));

        userServis.updateUser(12,12l);
    }
}