package com.nitish.uberreviewservice.services;

import com.nitish.uberreviewservice.model.Booking;
import com.nitish.uberreviewservice.model.Driver;
import com.nitish.uberreviewservice.model.Review;
import com.nitish.uberreviewservice.repositories.BookingRepository;
import com.nitish.uberreviewservice.repositories.DriverRepository;
import com.nitish.uberreviewservice.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewServices implements CommandLineRunner {

    private final ReviewRepository reviewRepository;
    private final BookingRepository bookingRepository;
    private final DriverRepository driverRepository;

    public ReviewServices(ReviewRepository reviewRepository,BookingRepository bookingRepository,
                          DriverRepository driverRepository)
    {
        this.reviewRepository=reviewRepository;
        this.bookingRepository=bookingRepository;
        this.driverRepository = driverRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("****************************************");

//        Review r= Review.builder()
//                .content("Nice ride quality")
//
//                .rating(4.7).build();// code created plain java object
//
//        Booking b=Booking.builder()
//                .endTime(new Date())
//                .review(r)
//                .build();
//        //reviewRepository.save(r);
//        bookingRepository.save(b);
//
//
//
//
//        System.out.println(r);
//        reviewRepository.save(r);//the code executes sql query
//
//        List<Review> reviews= reviewRepository.findAll();
//        for(Review review:reviews)
//        {
//            System.out.println(r.getContent());
//        }
//       // reviewRepository.deleteById(2L);

       // List<Driver> drivers=driverRepository.findAll();

        Optional<Driver> driver=driverRepository.findByIdAndLicenseNumber(3L,"MH12X9101");
        if(driver.isPresent())
        {
            System.out.println(driver.get().getName());
        }
        else
        {
            System.out.println("Not data Available");
        }

    }
}
