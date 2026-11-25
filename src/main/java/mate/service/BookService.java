package mate.service;

import java.util.List;
import mate.dto.BookDto;
import mate.dto.CreateBookRequestDto;

public interface BookService {

    List<BookDto> getAll();

    BookDto getBookById(Long id);

    BookDto createBook(CreateBookRequestDto bookDto);

}
