package com.ksnovaes.agenda.repository;

import com.ksnovaes.agenda.entity.ServiceManagement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ServiceRepository extends JpaRepository<ServiceManagement, Integer> {
    Optional<ServiceManagement> findByName(String name);
}
