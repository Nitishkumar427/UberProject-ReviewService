package com.nitish.uberreviewservice.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Entity
@Getter
public class DriverReview extends Review{

    private  String driverReview;
}
