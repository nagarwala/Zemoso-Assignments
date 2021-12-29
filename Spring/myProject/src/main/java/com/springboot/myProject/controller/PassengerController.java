package com.springboot.myProject.controller;

import com.springboot.myProject.entity.Passenger;
import com.springboot.myProject.entity.Train;
import com.springboot.myProject.service.PassengerService;
import com.springboot.myProject.service.TrainService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/passengers")
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @Autowired
    private TrainService trainService;


    @GetMapping("/list")
    private String listPassengers(@RequestParam("trainId") int trainId, Model theModel){

        List<Passenger> passengers = passengerService.findPassengers(trainId);

        theModel.addAttribute("passengers",passengers);
        theModel.addAttribute("trainId",trainId);

        return "list-passengers";
    }

    @GetMapping("passengers/showFormForAdd")
    public String showFormForAdd(@RequestParam("trainId") int theId, Model passengerModel, Model theModel){

        Optional<Train> theTrain= trainService.findById(theId);
        Passenger passenger = new Passenger();
        theModel.addAttribute("theTrain",theTrain.get());
        passengerModel.addAttribute("passenger",passenger);

        return "passenger-form";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("passengerId") int theId, Model passengerModel, Model theModel){

        //get train from the service
        Optional<Passenger> thePassenger = passengerService.findById(theId);

        theModel.addAttribute("theTrain",thePassenger.get().getTrain());
       passengerModel.addAttribute("passenger",thePassenger);

        //send over to form
        return "passenger-form";
    }

    @PostMapping("/save")
    public String savePassenger(@ModelAttribute("passenger") Passenger thePassenger){

        passengerService.save(thePassenger);

        return "redirect:/passengers/list?trainId="+thePassenger.getTrain().getId();
    }



    @GetMapping("/delete")
    public String delete(@RequestParam("passengerId") int theId){

        Optional<Passenger> thePassenger = passengerService.findById(theId);

       passengerService.deleteById(theId);

        return "redirect:/passengers/list?trainId=" + thePassenger.get().getTrain().getId() ;

    }
}
