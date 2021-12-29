package com.springboot.myProject.service;

import com.springboot.myProject.converter.TrainToDTOConverter;
import com.springboot.myProject.dao.TrainRepository;
import com.springboot.myProject.dto.TrainDto;
import com.springboot.myProject.entity.Train;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrainServiceImpl implements TrainService{

    @Autowired
    private TrainRepository trainRepository;

    @Autowired
    private TrainToDTOConverter trainToDTOConverter;


    @Override
    public List<TrainDto> findAll() {

        List<Train> theTrain = trainRepository.findAll();
        List<TrainDto> trainDto = trainToDTOConverter.entityToDto(theTrain);
        return trainDto;
    }

    @Override
    public Optional<Train> findById(int theId) {

        Optional<Train> result = trainRepository.findById(theId);
        Train theTrain = null;

        if(result.isPresent())
            theTrain = result.get();
        else
            throw new RuntimeException("Didn't found the train id: " + theId);

        return Optional.ofNullable(theTrain);
    }

    @Override
    public void save(Train theTrain) {

        trainRepository.save(theTrain);
    }

    @Override
    public void deleteById(int theId) {

        trainRepository.deleteById(theId);
    }
}
