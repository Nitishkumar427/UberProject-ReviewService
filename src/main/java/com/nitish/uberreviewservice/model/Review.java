package com.nitish.uberreviewservice.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EntityListeners(AuditingEntityListener.class)
@Table(name="t_review")
public class Review {

    @Id  // this annotation make the id property a primary key of our table
    @GeneratedValue(strategy = GenerationType.IDENTITY) // identity means auto_increament
    Long id;

    @Column(nullable = false)
    String content;

    Double rating;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP) // // this annotation tell spring the formate of date object to be stored i.e Date/Time ? Timestamp
    @CreatedDate    // this annotation tells spring that only handle it for  object creation
    Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate       // this annotation tells spring that only handle it for  object updation
    Date updatedAt;


}
