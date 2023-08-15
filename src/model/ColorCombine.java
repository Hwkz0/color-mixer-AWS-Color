package model;

import userinterface.ColorSelector;

import java.awt.*;

/**
 * Utility class for combining two colors into a new color.
 */

public class ColorCombine {

    /**
     * Combines two colors from the provided array into a new color.
     *
     * @param combineColorArray The array containing colors to combine.
     * @return The new color created by combining the two colors.
     */

    public static Color combineColor(Color[] combineColorArray) {

        int firstColorPosition = ColorSelector.selectColor()-1;
        int secondColorPosition = ColorSelector.selectColor()-1;

        Color firstColor = combineColorArray[firstColorPosition];
        Color secondColor = combineColorArray[secondColorPosition];

        if (firstColorPosition == secondColorPosition) {
            System.out.println("You selected the same color twice. Please select two different colors.");
            return combineColor(combineColorArray);
        }

        if (firstColorPosition > combineColorArray.length - 1 || secondColorPosition > combineColorArray.length - 1) {
            System.out.println("You selected a color that does not exist. Please select two different colors.");
            return combineColor(combineColorArray);
        }

        if (firstColor==null || secondColor==null) {
            System.out.println("You selected a color that does not exist. Please select two different colors.");
            return combineColor(combineColorArray);
        }

        int red = (firstColor.getRed() + secondColor.getRed()) / 2;
        int green = (firstColor.getGreen() + secondColor.getGreen()) / 2;
        int blue = (firstColor.getBlue() + secondColor.getBlue()) / 2;

        return new Color(red, green, blue);

    }

}
