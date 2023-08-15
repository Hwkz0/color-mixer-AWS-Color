package color_service.verifiers;

import static color_service.validators.ReadValidInteger.readValidInteger;

/**
 * Verifier class for verifying color palette size.
 */

public class ColorPaletteVerifier {

    /**
     * Verifies that the color palette size is greater than 0.
     *
     * @param verifyColorPaletteSize The color palette size to be verified.
     * @return The verified color palette size (greater than 0).
     */

    public static int verifyColorPaletteSize(int verifyColorPaletteSize) {

        //verify that the color palette size is greater than 0
        while (verifyColorPaletteSize < 1) {

            System.out.println("Please enter a number greater than 0.");

            System.out.print("How many colors do you want to store: ");

            //if the user entered an integer, assign it to the verifyColorPaletteSize variable
            verifyColorPaletteSize = readValidInteger();

        }

        //return the verified color palette size
        return verifyColorPaletteSize;

    }


}
