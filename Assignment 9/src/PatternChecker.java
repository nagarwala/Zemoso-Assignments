import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("enter a string");
        str = sc.nextLine();

        boolean isMatch = Pattern.matches("^[A-Z].*[.]$", str);
        System.out.println(isMatch);

    }
}
