package color_service;

import userinterface.ColorReader;

import java.awt.*;

/**
 * Utility class for creating a Color object.
 */

public class ColorCreator {

    /**
     * createColor() creates a Color object with the RGB values the user entered.
     *
     * @return returns a Color object with the RGB values the user entered.
     */


    public static Color createColor() {

        //creates a color object with the values the user entered
        Color createColor = new Color(ColorReader.readColorValue("red"),
                                    ColorReader.readColorValue("green"),
                                    ColorReader.readColorValue("blue"));

        return createColor;

    }


}
