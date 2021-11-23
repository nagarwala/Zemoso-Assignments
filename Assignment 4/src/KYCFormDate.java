import java.text.ParseException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class KYCFormDate {


    public static void main(String[] args) throws ParseException {
        int testCases;
        System.out.println("Enter Test Case");
        Scanner sc = new Scanner(System.in);
        testCases = sc.nextInt();

        String[] signupDate = new String[testCases];
        String[] currentDate = new String[testCases];

        System.out.println("Enter the signup and current dates");
        sc.nextLine();
        for (int i = 0; i < testCases; i++) {
            signupDate[i] = sc.nextLine();
            currentDate[i] = sc.nextLine();
        }


        for (int i = 0; i < testCases; i++) {
            DateTimeFormatter formatter = getDateTimeFormatter();

            LocalDate date1 = LocalDate.parse(signupDate[i], formatter);
            LocalDate date2 = LocalDate.parse(currentDate[i], formatter);


            int day = date1.getDayOfMonth();
            Month month = date1.getMonth();
            int year = date2.getYear();

            findFormFillingDateRange(formatter, date2, day, month, year);
        }
    }


    private static void findFormFillingDateRange(DateTimeFormatter formatter, LocalDate date2, int day, Month month, int year) {
        LocalDate formDate = LocalDate.of(year, month, day);
        LocalDate minDate = formDate.minusDays(30);
        LocalDate maxDate = formDate.plusDays(30);

        int check = 0;

        if(minDate.isAfter(date2) || minDate.isEqual(date2)) {
            System.out.println("No range");
            check = 1;
        }
        else
            System.out.print(minDate.format(formatter)+ "\t");

        if(check == 0) {
            if (maxDate.isAfter(date2) || maxDate.isEqual(date2))
                System.out.println(date2.format(formatter));
            else
                System.out.println(maxDate.format(formatter));
        }
    }

    private static DateTimeFormatter getDateTimeFormatter() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return formatter;
    }
}
