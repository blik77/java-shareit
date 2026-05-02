package ru.practicum.shareit.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private static final String NAME_BLANK_ERROR = "Имя не может быть пустым";
    private static final String EMAIL_BLANK_ERROR = "Email не может быть пустым";
    private static final String EMAIL_VALID_ERROR = "Email должен быть действительным";

    private Long id;

    @NotBlank(message = NAME_BLANK_ERROR)
    private String name;

    @NotBlank(message = EMAIL_BLANK_ERROR)
    @Email(message = EMAIL_VALID_ERROR)
    private String email;
}
