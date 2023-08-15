package color_service;

import model.ColorCombine;
import userinterface.interaction.MixAgainPrompt;
import static storage.ColorSaver.saveColor;
import static userinterface.interaction.MixAgainPrompt.mixAgainPrompt;

import java.awt.*;

/**
 * Utility class for mixing colors again based on user input.
 */

public class MixAgain {


    /**
     * Mixes colors again and updates the frame background.
     *
     * @param mixAgainArray The array of colors to mix.
     * @param frame The Frame object to update the background.
     */

    public static void mixAgain(Color[] mixAgainArray, Frame frame) {

        //prompts the user to mix colors again
        boolean mixAgain = mixAgainPrompt();

        //while the user wants to mix colors again
        while (mixAgain) {

            //mixes the colors again
            Color mixAgainColor = ColorCombine.combineColor(mixAgainArray);

            //updates the frame background
            frame.setVisible(true);

            frame.setBackground(mixAgainColor);

            //prompts the user to save the color
            saveColor(mixAgainColor, mixAgainArray);

            //prompts the user to mix colors again
            mixAgain = MixAgainPrompt.mixAgainPrompt();

        }

        //exits the program
        System.exit(0);

    }


}
