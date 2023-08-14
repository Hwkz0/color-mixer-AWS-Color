package model;

import storage.ColorArrayCreator;

import java.awt.*;

import static storage.ColorArrayInserter.insertColorIntoArray;
import static userinterface.ColorPaletteSize.colorPaletteSize;
import static userinterface.StartingColorsSize.startingColorSize;

public class ColorSetUp {
    //to be modified so that the setup steps are more clear

    public static Color[] colorSetUp(){

        //prompts user to enter the number of colors they want to store
        int colorSetUpArraySize = colorPaletteSize();
        int colorSetUpStartingColorSize = startingColorSize();


        //creates array of the size the user entered
        Color[] colorSetUpArray = ColorArrayCreator.createColorArray(colorSetUpArraySize);

        //creates as many colors as the user entered and stores them in the array

        insertColorIntoArray(
                //inserts as many colors the user specified
                colorSetUpStartingColorSize,
                //selects in which array to store colors
                colorSetUpArray);

        //tests to see if the colors were stored in the array correctly

        for (int i = 0; i < colorSetUpArraySize; i++) {
            System.out.println("Position "+ i +" "+(colorSetUpArray[i]));
        }

        return colorSetUpArray;

        }

}
