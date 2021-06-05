/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex16;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        int age = myApp.readAge();

        String outputString = myApp.generateOutput(age);
        myApp.printOutput(outputString);
    }

    public int readAge() {
        System.out.print("What is your age? ");
        return in.nextInt();
    }

    public String generateOutput(int age) {
        return age >= 16 ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
    }

    public void printOutput(String outputString) {
        System.out.println(outputString);
    }
}
