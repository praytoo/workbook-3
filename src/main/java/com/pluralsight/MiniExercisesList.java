package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class MiniExercisesList {
    public static void main(String[] args) {
        List<String> friends = new ArrayList<>(List.of("Sara", "Clara", "Harold", "Michael", "Shannon"));
        friends.add("Alice");
        friends.remove(2);

        for (int i = 0; i < friends.size(); i++){
            System.out.println(friends.get(i));
        }
        List <Integer> numbers = new ArrayList<>(List.of(87, 99, 88, 100, 52, 67, 2, 12, 22, 82));

        int sum = 0;
        for(int number : numbers) {
            sum += number;
            System.out.println("SUM: " + sum);

        int by2 = 0;
        for (int number2 : numbers) {
            by2 = number2 * 2;
            System.out.println("By 2: " + by2);
        }
        }
    }
}
