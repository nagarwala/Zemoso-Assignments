package streams.lambdas;

public class Student {
    int id;
    String name;
    int age;
    String gender;
    String engDepartment;
    int year_of_enrollment;
    double perTillDate;

    Student(int id, String name, int age, String gender, String department, int year, double percent){
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.engDepartment = department;
        this.year_of_enrollment = year;
        this.perTillDate = percent;
    }

    public String toString(){
        return id + " " + name + " " + age + " " + gender + " " + engDepartment + " " + year_of_enrollment + " " + perTillDate;
    }
}
