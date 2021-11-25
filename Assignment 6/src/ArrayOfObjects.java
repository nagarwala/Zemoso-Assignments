import java.util.Scanner;

public class ArrayOfObjects {

    ArrayOfObjects(String str){
        System.out.println("I like to " + str );
    }

    public static void main(String[] args) {
        ArrayOfObjects [] reference = new ArrayOfObjects[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; i++)
            reference[i] = new ArrayOfObjects(sc.nextLine());

    }
}
