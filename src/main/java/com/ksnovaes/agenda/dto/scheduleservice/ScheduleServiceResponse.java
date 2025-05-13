package com.ksnovaes.agenda.dto.scheduleservice;

import com.ksnovaes.agenda.enums.ScheduleStatus;

import java.time.LocalDateTime;

public record  ScheduleServiceResponse(
        int id,
        String customerName,
        String technicianName,
        String serviceName,
        LocalDateTime scheduledDate,
        ScheduleStatus status
) {
}
