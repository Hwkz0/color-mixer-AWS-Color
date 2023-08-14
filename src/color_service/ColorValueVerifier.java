package color_service;


import java.util.Scanner;

/**
 * Utility class for verifying color values within the range of 0 to 255.
 */

public class ColorValueVerifier {


    //Scanner for input
    static Scanner colorValueVerifierScanner = new Scanner(System.in);

    /**
     * Verifies that the provided color value is within the range of 0 to 255.
     *
     * @param verifyColorName The name of the color value being verified (e.g., "red", "green", "blue").
     * @param verifyColorValue The color value to be verified.
     * @return The verified color value within the range of 0 to 255.
     */

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
