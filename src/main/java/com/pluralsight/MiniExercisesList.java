package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class MiniExercisesList {
    public static void main(String[] args) {
        List<String> friends = new ArrayList<>();
        friends.add("Sara");
        friends.add("Clara");
        friends.add("Harold");
        friends.add("Michael");
        friends.add("Shannon");
        friends.add("Alice");
        friends.remove(2);

        for (int i = 0; i < friends.size(); i++){
            System.out.println(friends.get(i));
        }
        List <Integer> numbers = new ArrayList<>();
        numbers.add(87);
        numbers.add(99);
        numbers.add(88);
        numbers.add(100);
        numbers.add(52);
        numbers.add(67);
        numbers.add(2);
        numbers.add(12);
        numbers.add(22);
        numbers.add(82);

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
