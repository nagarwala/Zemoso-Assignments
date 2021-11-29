package streams.lambdas;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List <Student> studentList = new ArrayList<>();
        studentList.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        studentList.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        studentList.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        studentList.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        studentList.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        studentList.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        studentList.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        studentList.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        studentList.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        studentList.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        studentList.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        studentList.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        studentList.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        studentList.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        studentList.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        studentList.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        studentList.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

       List<String> departments = studentList.stream().map(student -> student.engDepartment).map(String :: toUpperCase).distinct().collect(Collectors.toList());

        System.out.println("All the departments in the college: " + departments);

        List<String> names = studentList.stream().filter(Student -> Student.year_of_enrollment > 2018).map(student -> student.name).collect(Collectors.toList());
        System.out.println("Names of students enrolled after 2018 are: "+ names);

        Set<String> malesInCS = studentList.stream().filter(student -> student.engDepartment.equals("Computer Science"))
                .filter(student -> student.gender.equals("Male"))
                .map(student -> student.name).collect(Collectors.toSet());
        System.out.println("All the males in the Computer Science department are: " + malesInCS);

        Map<String, Long> maleAndFemale = studentList.stream().collect(Collectors.groupingBy(student -> student.gender, Collectors.counting()));
        System.out.println("Number of male and female in each department is: " + maleAndFemale);

      Map<Object, Double> averageOfAge = studentList.stream().collect(Collectors.groupingBy(student -> student.gender, Collectors.averagingInt(student-> student.age)));
        System.out.println("The average age of male and female students " + averageOfAge);

      Student highestPercent =   studentList.stream().max(Comparator.comparing(student -> student.perTillDate)).get();
        System.out.println("The person to get the highest percent: " + highestPercent);


        Map<String, Long> noOfStudentsInDept = studentList.stream().collect(Collectors.groupingBy(student -> student.engDepartment, Collectors.counting()));
        System.out.println("No of student in each department: "+ noOfStudentsInDept);

        Map<Object, Double> averageOfPercentInDept = studentList.stream().collect(Collectors.groupingBy(student -> student.engDepartment, Collectors.averagingDouble(student-> student.perTillDate)));
        System.out.println("The average of percent in each department: " + averageOfPercentInDept);

        Student youngestElectronic = studentList.stream().filter(student -> student.gender.equals("Male"))
                .filter(student -> student.engDepartment.equals("Electronic"))
                .collect(Collectors.minBy(Comparator.comparing(student -> student.age))).get();
        System.out.println("The youngest male in electronic department: " + youngestElectronic);

     Map<String,Long> studentInCS =   studentList.stream().filter(student -> student.engDepartment.equals("Computer Science")).collect(Collectors.groupingBy(student -> student.gender, Collectors.counting()));
        System.out.println("The number of male and female student in Computer Science: " + studentInCS);
    }
}
