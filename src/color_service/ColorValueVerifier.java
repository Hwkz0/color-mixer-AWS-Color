package color_service;


import java.util.Scanner;

public class ColorValueVerifier {

    static Scanner colorValueVerifierScanner = new Scanner(System.in);

    public static int verifyColorValue(String verifyColorName, int verifyColorValue) {

        //also if it s needed to use a boolean method
        //return verifyColorValue >= 0 && verifyColorValue <= 255;


        //verify that the color value is between 0 and 255
        while (verifyColorValue < 0 || verifyColorValue > 255) {

            System.out.println("Invalid " + verifyColorName + " value. Please enter a value between 0 and 255.");

            System.out.print("Enter " + verifyColorName + " value: ");

            verifyColorValue = colorValueVerifierScanner.nextInt();

        }

        //return the verified color value
        return verifyColorValue;

    }

}
