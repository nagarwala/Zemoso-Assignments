package com.springboot.myProject.service;

import com.springboot.myProject.dto.TrainDto;
import com.springboot.myProject.entity.Train;

import java.util.List;
import java.util.Optional;

public interface TrainService {

    public List<TrainDto> findAll();

    public Optional<Train> findById(int theId);

    public void save(Train theTrain);

    public void deleteById(int theId);
}
