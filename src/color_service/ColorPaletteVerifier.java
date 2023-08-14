package color_service;

/**
 * Utility class for verifying color palette size.
 */

public class ColorPaletteVerifier {

    //Scanner for input
    static java.util.Scanner colorPaletteVerifierScanner = new java.util.Scanner(System.in);

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

            verifyColorPaletteSize = colorPaletteVerifierScanner.nextInt();

        }

        //return the verified color palette size
        return verifyColorPaletteSize;

    }


}
