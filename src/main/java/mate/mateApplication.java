package mate;

import mate.model.Book;
import mate.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class mateApplication {

    public static void main(String[] args) {
        SpringApplication.run(mateApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(BookService bookService) {
        return (args) -> {
            Book book = new Book();
            book.setAuthor("Stephen King");
            book.setTitle("The Shining");

            bookService.save(book);
        };

    }
}
