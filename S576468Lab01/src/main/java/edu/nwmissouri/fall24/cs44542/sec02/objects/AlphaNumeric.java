/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.nwmissouri.fall24.cs44542.sec02.objects;

/**
* Class: 44542-02 Object-Oriented Programming
*
* @author Sohitha Mallina
* Description: Lab01
* Due: 09/12/2024 */


import java.text.DecimalFormat;
import java.util.Random;
import java.lang.Math;

public class AlphaNumeric {
    public static void main(String[] args) {
        System.out.println("String Class Operations:");

        String sampleString = "Oops! Looks like Fall 2024 is here";
        System.out.println("Value of sampleString: " + sampleString);
        System.out.println("Length of sampleString: " + sampleString.length());
        System.out.println("Character at index 8 is: " + sampleString.charAt(8));

        String substring = sampleString.substring(17, 21);
        System.out.println("Substring from index 17 to 21 is: " + substring);

        if (sampleString.contains("Oops")) {
            System.out.println("Oops Found It");
        } else {
            System.out.println("Missed It");
        }

        String firstName = "Sohitha";
        String lastName = "Mallina";
        String fullName = firstName + "_" + lastName;
        System.out.println("Full Name: " + fullName);
        System.out.println("Full Name in lowercase: " + fullName.toLowerCase());
        System.out.println("Full Name in uppercase: " + fullName.toUpperCase());

        String sentence = "Learning Java is fun and exciting.";
        sentence = sentence.replace("exciting", "rewarding");
        System.out.println("Sentence after replacing is: " + sentence);

        String greeting = "   Hello, welcome to the coding world!   ";
        int indexOfCoding = greeting.indexOf("coding");
        System.out.println("Index of 'coding' is: " + indexOfCoding); // Should print 25

        String trimmedGreeting = greeting.trim();
        System.out.println("Sentence after trimming is: '" + trimmedGreeting + "'");

        String wordA = "fall";
        String wordB = "FALL";
        System.out.println("Equality ignoring case sensitivity: " + wordA.equalsIgnoreCase(wordB));
        System.out.println("Equality considering case sensitivity: " + wordA.equals(wordB));

        String fullNameWithHyphen = String.join("-", firstName, lastName);
        System.out.println("full name with hyphen is: " + fullNameWithHyphen);

        System.out.println("\nRandom Class Operations:");

        Random random = new Random();
        int player1Score = random.nextInt(13) + 1 + random.nextInt(13) + 1 + random.nextInt(13) + 1;
        int player2Score = random.nextInt(13) + 1 + random.nextInt(13) + 1 + random.nextInt(13) + 1;

        System.out.println("Player 1 Score: " + player1Score);
        System.out.println("Player 2 Score: " + player2Score);

        if (player1Score > player2Score) {
            System.out.println("Player 1 wins!");
        } else if (player2Score > player1Score) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a Tie!");
        }

        Random seededRandom = new Random(9);
        System.out.println("Three random floating-point values with seed 9:");
        for (int i = 0; i < 3; i++) {
            System.out.println(seededRandom.nextFloat());
        }

        System.out.println("\nMath Class Operations:");
        
        int num1 = -45;
        int num2 = 39;
        int absoluteDifference = Math.abs(num1 - num2);
        System.out.println("Absolute difference between -45 and 39: " + absoluteDifference);

        double result = Math.ceil(5.2 * 7.8);
        System.out.println("Rounded up result: " +(int) result);

        double sqrtValue = Math.sqrt(5 * 5 + 3 * 3);
        System.out.println("Square root of the sum of squares of 5 and 3: " + sqrtValue);

        double log28 = Math.log(28);
        double log4 = Math.log(4);
        System.out.println("Logarithm of 28: " + log28);
        System.out.println("Logarithm of 4: " + log4);

        int product = 7 * 9;
        
        int quotient = 40 / 5;
        
        int maxValue = Math.max(product, quotient);
        System.out.println("Maximum value between product of 7 and 9 and quotient of 40 divided by 5: " + maxValue);

        double tangent = Math.tan(Math.toRadians(45 - 30));
        System.out.println("Tangent of the difference between 45 and 30 degrees: " + tangent);
    }
}
