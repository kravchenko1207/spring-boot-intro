package mate.dto.mapper;

import mate.dto.BookDto;
import mate.dto.CreateBookRequestDto;
import mate.model.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookDto toBookDto(Book book);

    Book toBookEntity(CreateBookRequestDto requestDto);
}
