package Solid.Bank;

class NewJoinee extends Employee implements EmployeeSalary{


    NewJoinee(String name, String joining_date, int sal) {
        super(name, joining_date, sal);
    }

    @Override
    public double salaryPayable(Employee emp, int tax) {
        double taxDeducted = (emp.salary*tax)/100;
        return(emp.salary - taxDeducted);
    }
}

