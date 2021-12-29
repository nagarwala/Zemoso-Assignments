package com.springboot.myProject.dto;

import com.springboot.myProject.entity.Passenger;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
public class TrainDto {

    private int id;

    private String trainName;

    private String startStation;

    private String departureTime;

    List<Passenger> passengers;

    public TrainDto(int id, String trainName, String startStation, String departureTime) {
        this.id = id;
        this.trainName = trainName;
        this.startStation = startStation;
        this.departureTime = departureTime;
    }
}
