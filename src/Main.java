import enums.Gender;
import enums.Genre;
import enums.Language;
import model.Book;
import model.User;
import service.impl.BookServiceImpl;

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

        BigDecimal decimal = new BigDecimal(3000.00);
        List<Book> books = new ArrayList<>();

        BookServiceImpl bookService = new BookServiceImpl();

            Book word = new Book(Long.decode("12"), "Мир Жевотных", Genre.FANTASY, decimal, "Чарли Дюмуа", Language.ENGLISH, LocalDate.ofYearDay(1957, 12));
            Book warAndPeace = new Book(Long.decode("23"), "Война и Мир", Genre.HISTORICAL, decimal, "Лев Толстой", Language.RUSSIAN, LocalDate.ofYearDay(1869, 10));
            Book live = new Book(Long.decode("375"), "Жизнь после смерти", Genre.FANTASY, decimal, "Алекс Мёрти", Language.ENGLISH, LocalDate.ofYearDay(1957, 24));
            Book harry = new Book(Long.decode("82"), "Гарри Потер", Genre.FANTASY, decimal, "Джоан Роулинг", Language.ENGLISH, LocalDate.ofYearDay(2001, 9));
            Book right = new Book(Long.decode("67"), "Сила Разума", Genre.ROMANCE, decimal, "Николаичева Екатерина ", Language.ENGLISH, LocalDate.ofYearDay(2010, 18));

        User user1 = new User(Long.decode("123"),"Khafiz","Turusbek uulu","khafiz@gmail.com","+996501167662", Gender.MALE,new BigDecimal(12000),books);
        User user2 = new User(Long.decode("645"),"Bekjan","Jakanov","bekjan@gmail.com","+996507267753", Gender.MALE,new BigDecimal(8000),books);
        User user3 = new User(Long.decode("123"),"Aziza","Samatova","aziza@gmail.com","+996700491871", Gender.FEMALE,new BigDecimal(1234),books);


        books.add(word);
        books.add(warAndPeace);
        books.add(live);
        books.add(harry);
        books.add(right);

        System.out.println(bookService.createBooks(Collections.singletonList(books.get(0))));

        System.out.println(bookService.getAllBooks());

        System.out.println(word.getAuthor());

    }
}