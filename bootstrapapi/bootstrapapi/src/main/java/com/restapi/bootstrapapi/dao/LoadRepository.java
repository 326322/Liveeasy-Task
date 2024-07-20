package com.restapi.bootstrapapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.bootstrapapi.entities.Load;

import java.util.List;
import java.util.UUID;

public interface LoadRepository extends JpaRepository<Load, UUID> {
    List<Load> findByShipperId(UUID shipperId);
}
