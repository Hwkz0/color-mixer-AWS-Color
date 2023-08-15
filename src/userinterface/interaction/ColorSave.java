package userinterface.interaction;

import static color_service.validators.ReadValidString.readValidString;

/**
 * Interface class for prompting the user to decide whether to save a color.
 */

public class ColorSave {

    /**
     * Prompts the user to decide whether to save a color.
     *
     * @return true if the user wants to save the color, false otherwise.
     */

    public static boolean colorSavePrompt() {

        boolean colorSave;

        System.out.print("Would you like to save this color? (y/n) ");

        //reads the user input and verifies it
        String colorSaveString = readValidString();

        colorSave = colorSaveString.equals("y");

        //returns the verified position in the color palette
        return colorSave;

    }

}
