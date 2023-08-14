package color_service;

import userinterface.ColorReader;

import java.awt.*;

public class ColorCreator {

    public static Color createColor() {

        //creates a color object with the values the user entered
        Color createColor = new Color(ColorReader.readColorValue("red"),
                                    ColorReader.readColorValue("green"),
                                    ColorReader.readColorValue("blue"));

        return createColor;

    }


}
