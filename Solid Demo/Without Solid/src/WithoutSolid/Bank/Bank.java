package WithoutSolid.Bank;

import java.time.LocalDate;

public class Bank {
    private String name;
    private String ifscCode;
    double balance;
    double interestRate;
    String empName;
    int empSalary;

     Bank(String name, String code,double balance, double interestRate,String empName, int salary)
    {
        this.name = name;
        this.ifscCode = code;
        this.balance = balance;
        this.interestRate = interestRate;
        this.empName = empName;
        this.empSalary = salary;
    }

    void getCurrentBalance (int calculationPeriod){
        double interestReceived = (balance * calculationPeriod * interestRate)/1200;
        System.out.println("The current account balance is: " + balance+interestReceived );
    }

    void depositMoney(int amount){
           balance += amount;
           System.out.println("The amount deposited: " + amount);
           System.out.println("Your current balance is: " + balance);
        }

     double empSalaryPayable(int tax){
         double taxDeducted = (empSalary*tax)/100;
         return(empSalary - taxDeducted);
     }

    public static void main(String[] args) {
        Bank bk = new Bank("Kotak","KO123",40000,5.6,"Rohit kaur",1200000);
        bk.getCurrentBalance(3);
        bk.depositMoney(10000);
        System.out.println("The employee name is: " + bk.empName);
        System.out.println("Salary received is: "+ bk.empSalaryPayable(8));
    }

}

