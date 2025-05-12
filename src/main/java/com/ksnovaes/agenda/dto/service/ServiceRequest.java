package com.ksnovaes.agenda.dto.service;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public record ServiceRequest(
        @NotNull
        String name,
        @NotNull @Size(min = 10, max = 255)
        String description,
        @NotNull @Positive
        Double baseValue
) {
}
