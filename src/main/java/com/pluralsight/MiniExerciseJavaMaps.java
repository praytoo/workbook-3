package com.pluralsight;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MiniExerciseJavaMaps {
    HashMap<String, Integer> wordLength = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Aina", "310-323-2244");
        phoneBook.put("Sade", "323-619-2911");
        phoneBook.put("Mommy", "310-924-9988");

        System.out.println(phoneBook.get("Mommy"));

        System.out.println("Who's number do you want?");

        for (String name : phoneBook.keySet()) {
            System.out.println(name);
        }
        String choseName = scanner.nextLine();

        String phoneNr = phoneBook.get(choseName);
        if (phoneNr != null) {
            System.out.println(choseName + "'s phone number is " + phoneNr);
        } else {
            System.out.println("Idk!");
        }
    }
}


