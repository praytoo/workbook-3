package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PayrollCalculator {

    public PayrollCalculator() {
        readEmployeeFile();
    }

    private void readEmployeeFile() {
        String fileName = "C:\\employees.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            boolean isFirstLine = true; // skip headers if present

            while ((line = reader.readLine()) != null) {
                if (isFirstLine) { // optional — skip header line
                    isFirstLine = false;
                    continue;
                }

                // Split using "|" delimiter (escaped for regex)
                String[] tokens = line.split("\\|");

                // Copy values from tokens into variables
                int employeeId = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                // Create a new Employee object
                Employee emp = new Employee(employeeId, name, hoursWorked, payRate);

                // Display employee info
                System.out.printf("ID: %d | Name: %-15s | Gross Pay: $%.2f%n",
                        emp.getEmployeeid(),
                        emp.getName(),
                        emp.getGrossPay());
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new PayrollCalculator();
    }
}
