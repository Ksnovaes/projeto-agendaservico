package com.ksnovaes.agenda.dto.user;

import com.ksnovaes.agenda.enums.UserType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record UserRequest(
        @NotNull
        String name,
        @NotNull @Email
        String email,
        @NotNull
        String password,
        @NotNull
        UserType userType
) {
}
