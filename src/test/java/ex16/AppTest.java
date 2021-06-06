/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_string_older_than_sixteen () {
        App myApp = new App();

        int age = 17;

        String expectedOutput = "You are old enough to legally drive.";

        String actualOutput = myApp.generateOutput(age);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void output_string_sixteen () {
        App myApp = new App();

        int age = 16;

        String expectedOutput = "You are old enough to legally drive.";

        String actualOutput = myApp.generateOutput(age);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void output_string_younger_than_sixteen () {
        App myApp = new App();

        int age = 15;

        String expectedOutput = "You are not old enough to legally drive.";

        String actualOutput = myApp.generateOutput(age);

        assertEquals(expectedOutput, actualOutput);
    }


}