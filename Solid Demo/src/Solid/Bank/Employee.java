package Solid.Bank;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Employee {
    int salary;
    String name;
    LocalDate date_of_joining;

    Employee(String name, String joining_date, int sal){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.name = name;
        this.date_of_joining = LocalDate.parse(joining_date, formatter);
        this.salary = sal;
    }

    public int years_worked(){
        Period period = Period.between(date_of_joining, LocalDate.now());
        return (period.getYears());
    }
}
