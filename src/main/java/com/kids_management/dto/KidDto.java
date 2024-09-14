package com.kids_management.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KidDto {
    @NotNull(message = "Firstname is required")
    String firstName;
}
