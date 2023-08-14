package userinterface;

import java.util.Scanner;

import static color_service.ColorPaletteVerifier.verifyColorPaletteSize;

/**
 * Utility class for handling color palette size input.
 */

public class ColorPaletteSize {

    //Scanner for input


    static Scanner colorPaletteSizeScanner = new Scanner(System.in);

    /**
     * Retrieves the desired size of the color palette from the user and verifies it.
     *
     * @return The verified size of the color palette.
     */

    public static int colorPaletteSize() {

        int colorPaletteSize;

        System.out.print("What's the size of the color palette you plan to have? ");

        colorPaletteSize = colorPaletteSizeScanner.nextInt();

        return verifyColorPaletteSize(colorPaletteSize);

    }

}
