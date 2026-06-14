package com.nitish.uberreviewservice.services;

import com.nitish.uberreviewservice.model.Booking;
import com.nitish.uberreviewservice.model.Review;
import com.nitish.uberreviewservice.repositories.BookingRepository;
import com.nitish.uberreviewservice.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReviewServices implements CommandLineRunner {

    private final ReviewRepository reviewRepository;
    private final BookingRepository bookingRepository;

    public ReviewServices(ReviewRepository reviewRepository,BookingRepository bookingRepository)
    {
        this.reviewRepository=reviewRepository;
        this.bookingRepository=bookingRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("****************************************");

        Review r= Review.builder()
                .content("Nice ride quality")

                .rating(4.7).build();// code created plain java object

        Booking b=Booking.builder()
                .endTime(new Date())
                .review(r)
                .build();
        //reviewRepository.save(r);
        bookingRepository.save(b);




        System.out.println(r);
        reviewRepository.save(r);//the code executes sql query

        List<Review> reviews= reviewRepository.findAll();
        for(Review review:reviews)
        {
            System.out.println(r.getContent());
        }
       // reviewRepository.deleteById(2L);
    }
}
