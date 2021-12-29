package com.springboot.myProject.service;

import com.springboot.myProject.dao.PassengerRepository;
import com.springboot.myProject.entity.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PassengerServiceImpl implements PassengerService{

    private PassengerRepository passengerRepository;

    @Autowired
    public PassengerServiceImpl(PassengerRepository passengerRepository){
        this.passengerRepository = passengerRepository;
    }

    @Override
    public List<Passenger> findAll() {
        return passengerRepository.findAll();
    }

    @Override
    public Optional<Passenger> findById(int theId) {
        Optional<Passenger> result = passengerRepository.findById(theId);
        Passenger thePassenger = null;

        if(result.isPresent())
            thePassenger = result.get();
        else
            throw new RuntimeException("Didn't found the passenger id: " + theId);
        return Optional.ofNullable(thePassenger);
    }

    @Override
    public void save(Passenger thePassenger) {

        passengerRepository.save(thePassenger);
    }

    @Override
    public void deleteById(int theId) {

        passengerRepository.deleteById(theId);
    }

    @Override
    public List<Passenger> findPassengers(int trainId) {
        return passengerRepository.getPassengers(trainId);
    }

//    @Override
//    public void save(int tranId, Passenger thePassenger) {
//        passengerRepository.save(tranId,thePassenger);
//    }
}
