import java.util.Scanner;

public class ContainsAllLetters {

    public static boolean checkIfStringContainsAllLetters(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String inputString = sc.nextLine();

        int index = 0;
        boolean[] isVisited = new boolean[26];

        for(int i=0; i<inputString.length(); i++)
        {
            if('a' <= inputString.charAt(i) && inputString.charAt(i) <= 'z')
                index = inputString.charAt(i) - 'a';
            if('A' <= inputString.charAt(i) && inputString.charAt(i) <= 'Z')
                index = inputString.charAt(i) - 'A';

            isVisited[index] = true;
        }

        for(int i=0; i<26; i++){
            if(!isVisited[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        if (ContainsAllLetters.checkIfStringContainsAllLetters())
            System.out.println("Contains all the letters");
        else
            System.out.println("Does not contains all the alphabets");
    }
}

/*
 Time Complexity : O(n) where n = length of String
 Space Complexity : 1
*/
