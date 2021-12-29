package com.springboot.myProject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "passenger")
@Getter @Setter
@AllArgsConstructor
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "date_of_journey")
    private String dateOfJourney;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,
                          CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "train_id")
    private Train train;

    public Passenger(){
    }

    public Passenger(String firstName, String lastName, String dateOfJourney) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfJourney = dateOfJourney;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfJourney='" + dateOfJourney + '\'' +
                '}';
    }
}
