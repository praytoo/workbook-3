package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        BedtimeStories readStory = new BedtimeStories();
        readStory.showMenu();
    }
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        String menu = """
                Choose One To Read:
                1. Goldilocks
                2. Hansel & Gretel
                3. Mary Had A Little Lamb
                """;
        System.out.println(menu);
        System.out.println("Enter your choice: ");
        String selectedStory = scanner.nextLine();

        String fileName = "C:\\Users\\Student\\Documents\\MaryHadALittleLamb.txt";

        switch (selectedStory){
            case "1" -> fileName = "Golidlocks.txt";
            case "2" -> fileName = "HanselAndGretel.txt";
            case "3" -> fileName = "MaryHadALittleLamb.txt";
            default -> {
                System.out.println("Invalid choice, goodnight");
                return;
            }
        }
        readStoryFile(fileName);
        scanner.close();
    }

    private void readStoryFile(String fileName) {
        System.out.println("\n--- Reading " + fileName + " ---\n");

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                System.out.printf("%02d: %s%n", lineNumber, line);
                lineNumber++;
            }

            System.out.println("\n--- The End ---");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}