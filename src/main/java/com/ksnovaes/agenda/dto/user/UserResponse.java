package com.ksnovaes.agenda.dto.user;

import com.ksnovaes.agenda.dto.scheduleservice.ScheduleServiceResponse;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.List;

public record UserResponse(
        int id,
        String name,
        String email,
        String userType,
        List<ScheduleServiceResponse> customerSchedules,
        List<ScheduleServiceResponse> technicianSchedules,
        LocalDateTime createdAt
) {
}
