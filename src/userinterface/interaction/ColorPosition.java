package userinterface.interaction;

import static color_service.validators.ReadValidInteger.readValidInteger;

/**
 * Interface class for prompting the user to specify a position in the color palette.
 */

public class ColorPosition {

    /**
     * Prompts the user to specify a position in the color palette.
     *
     * @return The position in the color palette specified by the user.
     */

    public static int colorPositionPrompt() {

        int colorPosition;

        System.out.print("What position in the color palette would you like to save this color to? ");

        //reads the user input and verifies it
        colorPosition = readValidInteger();

        //returns the verified position in the color palette
        return colorPosition-1; //-1 to match array index

    }


}
