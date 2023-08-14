package userinterface;

import java.util.Scanner;

/**
 * Utility class for selecting colors.
 */

public class ColorSelector {

    // Scanner for input
    static Scanner colorSelectorScanner = new Scanner(System.in);

    /**
     * Allows the user to select a color.
     *
     * @return The selected color.
     */

    public static int selectColor() {

        int selectedColor;

        System.out.print("Select a color: ");

        selectedColor = colorSelectorScanner.nextInt();

        return selectedColor;

    }


}
