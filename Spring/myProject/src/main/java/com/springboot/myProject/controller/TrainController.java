package com.springboot.myProject.controller;

import com.springboot.myProject.dto.TrainDto;
import com.springboot.myProject.entity.Train;
import com.springboot.myProject.exceptionhandler.DuplicateTrainFoundException;
import com.springboot.myProject.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/trains")
public class TrainController {

    private TrainService trainService;


    @Autowired
    public TrainController(TrainService trainService){
        this.trainService = trainService;
    }

    @GetMapping("/list")
    private String listTrains(Model theModel){

        List<TrainDto> theTrain = trainService.findAll();
        theModel.addAttribute("trains", theTrain);

        return "list-trains";
    }

    @GetMapping("trains/showFormForAdd")
    public String showFormForAdd(Model theModel){

        Train theTrain = new Train();

        theModel.addAttribute("train", theTrain);

        return "train-form";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("trainId") int theId, Model theModel){

        //get train from the service
        Optional<Train> theTrain = trainService.findById(theId);

        //prepopulate the form data
        theModel.addAttribute("train", theTrain);

        //send over to form
        return "train-form";
    }

    @PostMapping("/save")
    public String saveTrain(@ModelAttribute("train") Train theTrain){

        List<TrainDto> trainDto = trainService.findAll();
        List<String> trainStartStation = new ArrayList<>();
        List<String> departureTime = new ArrayList<>();

        for(TrainDto tempName : trainDto)
            trainStartStation.add(tempName.getStartStation().toUpperCase());

        for(TrainDto tempTime: trainDto)
            departureTime.add(tempTime.getDepartureTime());

        if(trainStartStation.contains(theTrain.getStartStation().toUpperCase()) &&
                departureTime.contains(theTrain.getDepartureTime()))
            throw new DuplicateTrainFoundException("Train cannot be added");
        else {
            trainService.save(theTrain);
        }

        return "redirect:/trains/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("trainId") int theId){

        Optional<Train> theTrain = trainService.findById(theId);

        if(theTrain == null)
            throw new DuplicateTrainFoundException("Train id not found: " +theId );

        trainService.deleteById(theId);

        return "redirect:/trains/list";

    }

}
