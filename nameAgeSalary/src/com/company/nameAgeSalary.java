package com.company;

import java.util.Scanner;

class nameAgeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello. What is your name? : ");
        String name = scanner.nextLine();

        System.out.println("Hi,  " +name+"! "+  "How old are you? : ");
        int age = scanner.nextInt();

        System.out.println("So you're " +age+  ",eh? That's not old at all! How much do you make, " +name+ "?");
        double salary = scanner.nextDouble();

        System.out.println(salary+ "! I hope that's per hour and not per year! LOL! ");


    }
}
