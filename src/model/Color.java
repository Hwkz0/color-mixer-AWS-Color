package model;

import storage.ColorArrayCreator;

import static storage.ColorArrayInserter.insertColorIntoArray;
import static userinterface.ColorPaletteSize.colorPaletteSize;
import static userinterface.StartingColorsSize.startingColorSize;

public class Color {


    //to be modified so that the setup steps are more clear

    public static void colorSetUp(){

        //prompts user to enter the number of colors they want to store
        int colorSetUpArraySize = colorPaletteSize();
        int colorSetUpStartingColorSize = startingColorSize();



        java.awt.Color[] colorSetUpArray = ColorArrayCreator.createColorArray(colorSetUpArraySize);


        //creates as many colors as the user entered and stores them in the array
        insertColorIntoArray(
                //inserts as many colors the user specified
                colorSetUpStartingColorSize,
                //selects which array to store color
                colorSetUpArray);

        //to be implemented prompt to select color
        //to link accessor with prompt


        }

}
