package com.springboot.myProject.dao;

import com.springboot.myProject.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PassengerRepository extends JpaRepository<Passenger,Integer> {

    @Query(value = "select * from passenger where train_id= :trainId",nativeQuery = true)
    List<Passenger> getPassengers(@Param("trainId")int trainId);


}
