import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharacters {

    public static void countNumberOfCharacters(String str){

        HashMap<Character, Integer> characterCount = new HashMap<Character, Integer>();

        char[] stringToChar = str.toCharArray();

        for(char c : stringToChar){
            if(characterCount.containsKey(c))
                characterCount.put(c,characterCount.get(c)+1);
            else
                characterCount.put(c,1);
        }

        writingCharacterFile(characterCount);

    }

    public static void writingCharacterFile(HashMap<Character, Integer> characterCount) {
        try{
            PrintWriter pw = new PrintWriter("Assignment 11/StringCharacterOutput.txt");
            for(Map.Entry entry : characterCount.entrySet()){
                  pw.println(entry.getKey() + " " + entry.getValue());
            }
            pw.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner sc;

        try{
            sc = new Scanner(new File("Assignment 11/StringName.txt"));
            while(sc.hasNext())
            {
                String str = sc.nextLine();
                countNumberOfCharacters(str);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
