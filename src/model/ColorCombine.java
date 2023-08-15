package model;

import userinterface.interaction.ColorSelector;

import java.awt.*;

/**
 * Model class for combining two colors into a new color.
 */

public class ColorCombine {

    /**
     * Combines two colors from the provided array into a new color.
     *
     * @param combineColorArray The array containing colors to combine.
     * @return The new color created by combining the two colors.
     */

    public static Color combineColor(Color[] combineColorArray) {

        //selects the colors to combine
        int firstColorPosition = ColorSelector.selectColor()-1;//-1 because the array starts at 0
        int secondColorPosition = ColorSelector.selectColor()-1;//-1 because the array starts at 0

        //gets the colors from the array
        Color firstColor = combineColorArray[firstColorPosition];
        Color secondColor = combineColorArray[secondColorPosition];

        //checks if the user selected the same color twice
        if (firstColorPosition == secondColorPosition) {
            System.out.println("You selected the same color twice. Please select two different colors.");
            return combineColor(combineColorArray);
        }

        //checks if the user selected a color that does not exist or is out of palette bounds
        if (firstColorPosition > combineColorArray.length - 1 || secondColorPosition > combineColorArray.length - 1 //length-1 because the array starts at 0
                                                                                                    || firstColor==null || secondColor==null) {
            System.out.println("You selected a color that does not exist. Please select two different colors.");
            return combineColor(combineColorArray);
        }

        //combines the colors
        int red = (firstColor.getRed() + secondColor.getRed()) / 2;
        int green = (firstColor.getGreen() + secondColor.getGreen()) / 2;
        int blue = (firstColor.getBlue() + secondColor.getBlue()) / 2;

        //returns the new color
        return new Color(red, green, blue);

    }

}
