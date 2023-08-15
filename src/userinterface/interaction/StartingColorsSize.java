package userinterface.interaction;

import static color_service.validators.ReadValidInteger.readValidInteger;
import static color_service.verifiers.ColorPaletteVerifier.verifyColorPaletteSize;

/**
 * Interface class for handling the number of starting colors.
 */

public class StartingColorsSize {

    /**
     * Retrieves the desired number of starting colors from the user and verifies it.
     *
     * @return The verified number of starting colors.
     */

    public static int startingColorSize(){

        int startingColorSize;

        System.out.print("How many colors will you start with? ");

        //reads the user input and verifies it
        startingColorSize = readValidInteger();

        //returns the verified number of starting colors
        return verifyColorPaletteSize(startingColorSize);

    }

}
