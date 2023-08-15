package color_service;

import userinterface.interaction.ColorReader;

import java.awt.*;

/**
 * Utility class for creating a Color object.
 */

public class ColorCreator {

    /**
     * Creates a Color object with the RGB values the user entered.
     *
     * @return A Color object with the RGB values provided by the user.
     */

    public static Color createColor() {

        //creates a color object with the values the user entered
        Color createColor = new Color(ColorReader.readColorValue("red"),
                                    ColorReader.readColorValue("green"),
                                    ColorReader.readColorValue("blue"));

        //returns the color object
        return createColor;

    }


}
