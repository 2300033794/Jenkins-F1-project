package com.klef.dev.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.dev.model.Driver;
import com.klef.dev.repository.DriverRepository;

@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverRepository driverRepository;

    @Override
    public Driver addDriver(Driver driver) {
        return driverRepository.save(driver);
    }

    @Override
    public Driver updateDriver(Driver driver) {
        return driverRepository.save(driver);
    }

    @Override
    public String deleteDriver(int id) {
        Optional<Driver> drv = driverRepository.findById(id);
        if (drv.isPresent()) {
            driverRepository.deleteById(id);
            return "Driver with ID " + id + " deleted successfully.";
        }
        return "Driver with ID " + id + " not found.";
    }

    @Override
    public Driver getDriverById(int id) {
        return driverRepository.findById(id).orElse(null);
    }

    @Override
    public List<Driver> getAllDrivers() {
        return driverRepository.findAll();
    }
}
