package storage;

import userinterface.ColorPaletteSize;
import color_service.ColorCreator;

import java.awt.*;

public class ColorArray {

    public static void storeColorArray() {

        //prompts user to enter the number of colors they want to store
        int colorArraySize = ColorPaletteSize.colorPaletteSize();

        //creates an array of the size the user entered
        Color[] colorArray= new Color[colorArraySize];

        //creates as many colors as the user entered and stores them in the array
        for(int i= 0; i < colorArraySize; i++) {
            colorArray[i]= ColorCreator.createColor();
        }

        //tests to see if the colors were stored in the array correctly
        for (int i= 0; i < colorArraySize; i++) {
            System.out.println("Color"+(i+1)+":"+colorArray[i]);
        }

    }

}
