package model;

import storage.ColorArrayCreator;

import java.awt.*;

import static storage.ColorArrayInserter.insertColorIntoArray;
import static userinterface.informative.ColorPaletteShow.showColorPalette;
import static userinterface.interaction.ColorPaletteSize.colorPaletteSize;
import static userinterface.interaction.StartingColorsSize.startingColorSize;

/**
 * Model class for setting up an array of colors.
 */

public class ColorSetUp {
    //to be modified so that the setup steps are more clear

    /**
     * Sets up an array of colors based on user input.
     *
     * @return An array of colors initialized according to user input.
     */

    public static Color[] colorSetUp(){

        //prompts user to enter the number of colors they want to store
        int colorSetUpArraySize = colorPaletteSize();
        //prompts user to enter the number of colors they want to store
        int colorSetUpStartingColorSize = startingColorSize();


        //creates array of the size the user entered
        Color[] colorSetUpArray = ColorArrayCreator.createColorArray(colorSetUpArraySize);

        //creates as many colors as the user entered and stores them in the array
        insertColorIntoArray(
                //inserts as many colors the user specified
                colorSetUpStartingColorSize,
                //selects in which array to store colors
                colorSetUpArray);

        //shows the colors in the array
        showColorPalette(colorSetUpArray);

        //returns the array of colors
        return colorSetUpArray;

        }

}
