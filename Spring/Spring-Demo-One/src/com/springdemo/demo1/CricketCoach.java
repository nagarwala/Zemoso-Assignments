package com.springdemo.demo1;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;
    private String email;
    private String team;

    public CricketCoach(){
        //System.out.println("CricketCoach: no argument constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        //System.out.println("Inside setter method");
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String email){
        //System.out.println("Inside email method");
        this.email = email;
    }

    public void setTeam(String team){
       //System.out.println("Inside team method");
        this.team = team;
    }

    public String getEmail() {
        return "Email Id: " + email;
    }

    public String getTeam() {
        return "Team: " + team;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Cover drive today";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune() + "; Try to stay longer at the crease";
    }
}
