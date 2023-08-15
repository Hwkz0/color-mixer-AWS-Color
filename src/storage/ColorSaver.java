package storage;

import java.awt.*;

import static userinterface.informative.ColorPaletteShow.showColorPalette;
import static userinterface.interaction.ColorPosition.colorPositionPrompt;
import static userinterface.interaction.ColorSave.colorSavePrompt;

/**
 * Storage class for saving colors to an array.
 */

public class ColorSaver {

/**
     * Saves the specified color to the specified array.
     *
     * @param savedColor The color to be saved.
     * @param saveColorArray The array to which the color will be saved.
     * @return The array with the saved color.
     */

    public static Color[] saveColor(Color savedColor, Color[] saveColorArray) {

        //prompts the user to save the color
        boolean saveColor= colorSavePrompt();

        //if the user wants to save the color
        if (saveColor){
            int colorArrayPosition = colorPositionPrompt();
            saveColorArray[colorArrayPosition] = savedColor;
        }

        //shows the colors in the array
        showColorPalette(saveColorArray);

        //returns the array with the saved color
        return saveColorArray;
    }

}
