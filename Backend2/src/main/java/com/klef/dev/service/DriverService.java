package com.klef.dev.service;

import java.util.List;
import com.klef.dev.model.Driver;

public interface DriverService {
    Driver addDriver(Driver driver);
    Driver updateDriver(Driver driver);
    String deleteDriver(int id);
    Driver getDriverById(int id);
    List<Driver> getAllDrivers();
}
