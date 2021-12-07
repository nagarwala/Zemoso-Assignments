package com.springdemo.demo1;

public class TrackCoach implements Coach {

    private  FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Today, you will be running 5km";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune() + "; You will do great!";
    }
}
