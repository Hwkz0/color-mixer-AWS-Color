package userinterface.interaction;

import color_service.verifiers.ColorValueVerifier;
import static color_service.validators.ReadValidInteger.readValidInteger;

/**
 * Interface class for reading color values from the user.
 */

public class ColorReader {

    /**
     * Reads and verifies a color value from the user.
     *
     * @param colorName The name of the color value being read (e.g., "red", "green", "blue").
     * @return The verified color value.
     */

    public static int readColorValue(String colorName) {

        int readColorValue;

        System.out.print("Enter " + colorName + " value: ");

        //reads the user input and verifies it
        readColorValue = readValidInteger();

        //returns the verified color value
        return ColorValueVerifier.verifyColorValue(colorName, readColorValue);

    }

}
