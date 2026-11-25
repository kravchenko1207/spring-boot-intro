package mate.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import mate.dto.BookDto;
import mate.dto.CreateBookRequestDto;
import mate.dto.mapper.BookMapper;
import mate.exception.EntityNotFoundException;
import mate.model.Book;
import mate.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public List<BookDto> getAll() {
        return bookRepository.findAll().stream()
                .map(bookMapper::toBookDto)
                .toList();
    }

    @Override
    public BookDto getBookById(Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(
                        "Book with id" + id + " not found"
                ));
        return bookMapper.toBookDto(book);
    }

    @Override
    public BookDto createBook(CreateBookRequestDto bookDto) {
        return bookMapper.toBookDto(bookRepository.save(bookMapper.toBookEntity(bookDto)));
    }
}
