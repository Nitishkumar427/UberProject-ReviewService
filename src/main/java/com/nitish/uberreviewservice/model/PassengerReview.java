package com.nitish.uberreviewservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Entity
@Getter
public class PassengerReview extends Review{

    @Column(nullable = false)
    private String passengerReview;

    @Column(nullable = false)
    private String passengerRating;
}
