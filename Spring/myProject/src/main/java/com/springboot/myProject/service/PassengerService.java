package com.springboot.myProject.service;

import com.springboot.myProject.entity.Passenger;

import java.util.List;
import java.util.Optional;

public interface PassengerService {

    public List<Passenger> findAll();

    public Optional<Passenger> findById(int theId);

    public void save(Passenger thePassenger);

    public void deleteById(int theId);

    public List<Passenger> findPassengers(int trainId);

}
