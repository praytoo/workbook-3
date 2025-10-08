package com.pluralsight;

import java.util.Scanner;

public class PC {
    public void menu(){
        System.out.println("Enter the name of the employee file to process: ");
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();
        System.out.println("Enter the name of the payroll file to create: ");
        String payrollFile = scanner.nextLine();

    }
    public static void main(String[] args){
    PC pc = new PC();
    pc.menu();
    }
}
