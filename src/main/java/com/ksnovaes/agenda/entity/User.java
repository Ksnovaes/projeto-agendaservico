package com.ksnovaes.agenda.entity;

import com.ksnovaes.agenda.enums.ScheduleStatus;
import com.ksnovaes.agenda.enums.UserType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    @OneToMany(mappedBy = "customer")
    private List<ScheduleService> scheduledCustomerServices;

    @OneToMany(mappedBy = "technician")
    private List<ScheduleService> scheduledTechnicianServices;

    @CreatedDate
    private LocalDateTime createdAt;
}
