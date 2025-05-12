package com.ksnovaes.agenda.dto.service;

import com.ksnovaes.agenda.dto.scheduleservice.ScheduleServiceResponse;

import java.util.List;

public record ServiceResponse(
        String name,
        String description,
        Double baseValue,
        List<ScheduleServiceResponse> scheduleHistory
) {
}
