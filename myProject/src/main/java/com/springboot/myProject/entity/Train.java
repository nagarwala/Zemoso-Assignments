package com.springboot.myProject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "train")
@AllArgsConstructor
@Getter @Setter
public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "train_name")
    private String trainName;

    @Column(name = "starting_station")
    private String startStation;

    @Column(name = "departure_time")
    private String departureTime;

    @OneToMany(mappedBy = "train", cascade = CascadeType.ALL)
    private List<Passenger> passengers;

    public Train(int id,String trainName, String startStation, String departureTime) {
        this.trainName = trainName;
        this.startStation = startStation;
        this.departureTime = departureTime;
        this.id = id;
    }

    public Train(){}

    @Override
    public String toString() {
        return "Train{" +
                "id=" + id +
                ", trainName='" + trainName + '\'' +
                ", startStation='" + startStation + '\'' +
                ", departureTime='" + departureTime + '\'' +
                '}';
    }
}
