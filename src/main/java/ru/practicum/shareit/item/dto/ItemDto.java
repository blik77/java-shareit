package ru.practicum.shareit.item.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDto {
    private static final String NAME_BLANK_ERROR = "Имя не может быть пустым";
    private static final String DESCRIPTION_BLANK_ERROR = "Описание не может быть пустым";
    private static final String AVAILABLE_NULL_ERROR = "Статус доступности не может быть пустым";

    private Long id;

    @NotBlank(message = NAME_BLANK_ERROR)
    private String name;

    @NotBlank(message = DESCRIPTION_BLANK_ERROR)
    private String description;

    @NotNull(message = AVAILABLE_NULL_ERROR)
    private Boolean available;

    private Long requestId;
}
