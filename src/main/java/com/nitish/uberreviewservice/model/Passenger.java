package com.nitish.uberreviewservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Passenger extends  BaseModel{

    private  String name;

    @OneToOne(mappedBy = "passenger")
    private List<Booking> bookings=new ArrayList<>();
}
