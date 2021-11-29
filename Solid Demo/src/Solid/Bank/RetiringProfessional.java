package Solid.Bank;

class RetiringProfessional extends Employee implements EmployeeSalary, ProvidentFund{

    private double providentAmount;

    RetiringProfessional(String name, String joining_date, int sal) {
        super(name, joining_date, sal);
    }


    @Override
    public double calculateProvidentAmount(Employee e) {
            double perYearProvident = salaryPayable(e,10) *0.05;
            providentAmount = e.years_worked() * perYearProvident;
            return providentAmount;
    }

    @Override
    public double salaryPayable(Employee emp, int tax) {
        double taxDeducted = (emp.salary*tax)/100;
        return(emp.salary - taxDeducted);
    }
}