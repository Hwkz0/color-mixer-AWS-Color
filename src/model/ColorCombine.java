package model;

import userinterface.ColorSelector;

import java.awt.*;

public class ColorCombine {

    public static Color combineColor(Color[] combineColorArray) {

        int firstColorPosition = ColorSelector.selectColor();
        int secondColorPosition = ColorSelector.selectColor();

        Color firstColor = combineColorArray[firstColorPosition];
        Color secondColor = combineColorArray[secondColorPosition];

        int red = (firstColor.getRed() + secondColor.getRed()) / 2;
        int green = (firstColor.getGreen() + secondColor.getGreen()) / 2;
        int blue = (firstColor.getBlue() + secondColor.getBlue()) / 2;

        return new Color(red, green, blue);

    }

}
