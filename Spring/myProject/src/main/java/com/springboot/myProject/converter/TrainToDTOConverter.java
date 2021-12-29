package com.springboot.myProject.converter;

import com.springboot.myProject.dto.TrainDto;
import com.springboot.myProject.entity.Train;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TrainToDTOConverter {

    public TrainDto entityToDto(Train train)
    {
        TrainDto trainDto = new TrainDto();
        trainDto.setId(train.getId());
        trainDto.setTrainName(train.getTrainName());
        trainDto.setStartStation(train.getStartStation());
        trainDto.setDepartureTime(train.getDepartureTime());
        trainDto.setPassengers(train.getPassengers());
        return trainDto;
    }

    public Train dtoToEntity(TrainDto trainDto)
    {
        Train train =new Train();
        train.setId(trainDto.getId());
        train.setTrainName(trainDto.getTrainName());
        train.setStartStation(trainDto.getStartStation());
        train.setDepartureTime(trainDto.getDepartureTime());
        train.setPassengers(trainDto.getPassengers());
        return train;
    }
    public List<TrainDto> entityToDto(List<Train> train)
    {
        return train.stream().map(x->entityToDto(x)).collect(Collectors.toList());
    }
    public List<Train> dtoToEntity(List<TrainDto> trainDto)
    {
        return trainDto.stream().map(x->dtoToEntity(x)).collect(Collectors.toList());
    }
}
