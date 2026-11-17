package mate.dto;

import jakarta.persistence.Column;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateBookRequestDto {
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String author;
    @Column(nullable = false, unique = true)
    private String isbn;
    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal price;
    @Column(columnDefinition = "TEXT")
    private String description;
    private String coverImage;
}
