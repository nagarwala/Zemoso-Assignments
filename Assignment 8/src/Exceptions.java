import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {


   public static void findExceptions(String ptr) throws FileNotFoundException,NullPointerException, ArithmeticException {

        Scanner sc = new Scanner(new File("Assignment 8/Input1.txt"));
        int input;
        int sum = 0;

       if(ptr.equals("Zemoso"))
           System.out.println("I work in zemoso");
       else
           System.out.println("I don't work");

        while(sc.hasNext())
        {
            input = sc.nextInt();
            System.out.println(input/0);
           // sum += input;
        }
        //System.out.println("Sum is:" + sum);




   }

    public static void main(String[] args) {

        try{
            findExceptions(null);

        } catch (FileNotFoundException |NullPointerException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("I always have a exception");
        }
    }
}
