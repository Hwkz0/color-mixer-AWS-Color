package userinterface;

import java.util.Scanner;

import static color_service.ColorPaletteVerifier.verifyColorPaletteSize;

/**
 * Utility class for handling the size of starting colors.
 */

public class StartingColorsSize {

    // Scanner for input
    static Scanner startingColorSizeScanner = new Scanner(System.in);

    /**
     * Retrieves the desired size of starting colors from the user and verifies it.
     *
     * @return The verified size of starting colors.
     */

    public static int startingColorSize(){

        int startingColorSize;

        System.out.print("How many colors will you start with? ");

        startingColorSize = startingColorSizeScanner.nextInt();

        return verifyColorPaletteSize(startingColorSize);

    }

}
