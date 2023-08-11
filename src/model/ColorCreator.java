package model;

import color_service.ColorReader;

import java.awt.*;

public class ColorCreator {

    public static Color createColor() {

        Color createColor = new Color(ColorReader.readColorValue("red"),
                                ColorReader.readColorValue("green"),
                                ColorReader.readColorValue("blue"));

        return createColor;

    }


}
