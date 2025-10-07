package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] quotes = new String[10];
        quotes[0] = "“Success is not final, failure is not fatal: it is the courage to continue that counts.” — Winston Churchill";
        quotes[1] = "“The best way to predict the future is to create it.” — Peter Drucker";
        quotes[2] = "“Don’t watch the clock; do what it does. Keep going.” — Sam Levenson";
        quotes[3] = "“It always seems impossible until it’s done.” — Nelson Mandela";
        quotes[4] = "“Your time is limited, so don’t waste it living someone else’s life.” — Steve Jobs";
        quotes[5] = "“Discipline is choosing between what you want now and what you want most.” — Abraham Lincoln (attributed)";
        quotes[6] = "“What you do speaks so loudly that I cannot hear what you say.” — Ralph Waldo Emerson";
        quotes[7] = "“If you want to lift yourself up, lift up someone else.” — Booker T. Washington";
        quotes[8] = "“In the middle of difficulty lies opportunity.” — Albert Einstein";
        quotes[9] = "“Dream big. Start small. Act now.” — Robin Sharma";

        String anotherSaying = "yes";
        try {
            System.out.println("Select a number between 1 and 10");
            int nrQuote = scanner.nextInt();
            scanner.nextLine();
            int i = nrQuote;
            System.out.println(nrQuote + " " + quotes[i - 1]);
            System.out.println("Do you want to see another quote?");
            anotherSaying = scanner.nextLine();
            if (anotherSaying.equalsIgnoreCase("yes")) {
                System.out.println("Select a number between 1 and 10");
                int nrQuote2 = scanner.nextInt();
                scanner.nextLine();
                int i2 = nrQuote2;
                System.out.println(nrQuote2 + " " + quotes[i2 - 1]);
            } else if (anotherSaying.equalsIgnoreCase("no")) {
                System.out.println("Thanks for stopping by");
                scanner.nextLine();
            }
            System.out.println("Do you want to see a random quote?");
            String randomQuote = "";
            if (randomQuote.equalsIgnoreCase("yes")) {
                String quote = quotes[(int) Math.random()* 10];
                randomQuote = scanner.nextLine();
                System.out.println("Random:" + quote);
            }else
                System.out.println("Thanks for stopping by");
        }
        catch (Exception e) {
            System.out.println("Select a number between 1 and 10: " + e.getMessage());
        }
        scanner.close();
    }
}
