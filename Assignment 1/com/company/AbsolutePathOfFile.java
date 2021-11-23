package com.company;

import java.io.File;
import java.util.Scanner;

public class AbsolutePathOfFile {

    void searchForFile()
    {
        // Stores the path where the files are to be searched
        File fileName = new File("/home/nitesa/IdeaProjects");
        String str;
        Scanner sc = new Scanner(System.in);

         while(true) {
             int counter = 0;
             System.out.println("Enter the name of file to be searched");
             str = sc.nextLine();


             String[] files = fileName.list();
             for (String file : files) {

                 if (str.equals(file)) {
                     counter = 1;
                     System.out.println("File found: " + file);
                     System.out.println("Path is: " + fileName.getAbsolutePath() + "/" + str);
                 }
             }

             if (counter == 0)
                 System.out.println("File Not found; Please reenter the filename");
         }
    }

    public static void main(String[] args) {
        AbsolutePathOfFile obj = new AbsolutePathOfFile();
        obj.searchForFile();

    }
}
