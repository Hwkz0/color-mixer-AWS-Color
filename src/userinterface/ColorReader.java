package userinterface;

import color_service.ColorValueVerifier;

import java.util.Scanner;

/**
 * Utility class for reading color values from the user.
 */

public class ColorReader {

    // Scanner for input

    static Scanner colorScanner = new Scanner(System.in);

    /**
     * Reads and verifies a color value from the user.
     *
     * @param colorName The name of the color value being read (e.g., "red", "green", "blue").
     * @return The verified color value.
     */

    public static int readColorValue(String colorName) {

        int readColorValue;

        System.out.print("Enter " + colorName + " value: ");

        readColorValue = colorScanner.nextInt();

        return ColorValueVerifier.verifyColorValue(colorName, readColorValue);

    }

}
