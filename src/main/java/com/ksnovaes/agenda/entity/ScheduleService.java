package com.ksnovaes.agenda.entity;

import com.ksnovaes.agenda.enums.ScheduleStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.FutureOrPresent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScheduleService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private User customer;

    @ManyToOne
    @JoinColumn(name = "technician_id")
    private User technician;

    @ManyToOne
    @JoinColumn(name = "service_id")
    private ServiceManagement serviceManagement;

    @FutureOrPresent
    private LocalDateTime scheduled_date;

    @Enumerated(EnumType.STRING)
    private ScheduleStatus status;
}
