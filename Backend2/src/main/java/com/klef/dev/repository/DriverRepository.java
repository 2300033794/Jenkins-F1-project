package com.klef.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.dev.model.Driver;

public interface DriverRepository extends JpaRepository<Driver, Integer> {
}
