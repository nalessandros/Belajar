package com.rplbo.lampuhias;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class LampuHias {
    public static void main(String[] args) {
        String fileName = "soal.txt";
        String content = "4 6 9\n" +
                         "4\n" +
                         "10\n" +
                         "36\n" +
                         "90\n" +
                         "100";

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }




        // Using standard input
        // kalau yang dipakai ini tinggal dihilagkan garis miring di depannya dan buang file scanner yang bawah
        // Scanner scanner = new Scanner(System.in);
        
        //Read from file instead of standard input
        File file = new File("soal.txt");
        Scanner scanner;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return;
        }
        
        List<Integer> lifeElements = new ArrayList<>();
        String[] elements = scanner.nextLine().split(" ");
        
        for (String element : elements) {
            lifeElements.add(Integer.parseInt(element));
        }

        int n = Integer.parseInt(scanner.nextLine());
        
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(scanner.nextLine());
            String apakahIniKPK = "YA";

            for (int element : lifeElements) {
                if (a % element != 0) {
                    apakahIniKPK = "TIDAK";
                    break;
                }
            }

            System.out.println(apakahIniKPK);
        }
        
        scanner.close();
    }
}



