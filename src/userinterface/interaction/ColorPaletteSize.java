package userinterface.interaction;

import static color_service.validators.ReadValidInteger.readValidInteger;
import static color_service.verifiers.ColorPaletteVerifier.verifyColorPaletteSize;
/**
 * Interface class for handling color palette size input.
 */

public class ColorPaletteSize {

    /**
     * Retrieves the desired size of the color palette from the user and verifies it.
     *
     * @return The verified size of the color palette.
     */

    public static int colorPaletteSize() {

        int colorPaletteSize;

        System.out.print("What's the size of the color palette you plan to have? ");

        //reads the user input and verifies it
        colorPaletteSize = readValidInteger();

        //returns the verified size of the color palette
        return verifyColorPaletteSize(colorPaletteSize);

    }

}
