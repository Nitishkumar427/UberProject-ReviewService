package com.nitish.uberreviewservice.repositories;

import com.nitish.uberreviewservice.model.Booking;
import com.nitish.uberreviewservice.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {

    Optional<Driver> findByIdAndLicenseNumber(Long id, String licenseNumber);
}
