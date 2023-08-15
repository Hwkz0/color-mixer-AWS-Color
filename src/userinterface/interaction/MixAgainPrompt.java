package userinterface.interaction;

import static color_service.validators.ReadValidString.readValidString;

/**
 * Interface class for prompting the user to decide whether to mix another color.
 */

public class MixAgainPrompt {

    /**
     * Prompts the user to decide whether to mix another color.
     *
     * @return true if the user wants to mix another color, false otherwise.
     */

    public static boolean mixAgainPrompt() {
        
        boolean mixAgain;
        
        System.out.print("Would you like to mix another color? (y/n) ");

        //reads the user input and verifies it
        String mixAgainString = readValidString();

        //if the user wants to mix another color, returns true
        mixAgain = mixAgainString.equals("y");

        //returns the verified position in the color palette
        return mixAgain;
        
    }
    
}
