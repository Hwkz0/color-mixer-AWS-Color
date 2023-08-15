package userinterface.interaction;

import static color_service.validators.ReadValidInteger.readValidInteger;

/**
 * Interface class for selecting colors.
 */

public class ColorSelector {

    /**
     * Allows the user to select a color.
     *
     * @return The selected color.
     */

    public static int selectColor() {

        int selectedColor;

        System.out.print("Select a color: ");

        //reads the user input and verifies it
        selectedColor = readValidInteger();

        //returns the verified color
        return selectedColor;

    }


}
