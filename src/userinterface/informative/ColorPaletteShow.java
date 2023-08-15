package userinterface.informative;

import java.awt.*;

/**
 * Interface class for displaying the color palette.
 */

public class ColorPaletteShow {

    /**
     * Displays the color palette.
     *
     * @param showColorPaletteArray The array to be displayed.
     */

    public static void showColorPalette(Color[] showColorPaletteArray) {

        //displays the color palette
        for (int i = 0; i < showColorPaletteArray.length; i++) {
            System.out.println("Position "+(i+1)+" "+showColorPaletteArray[i]);
        }

    }


}
