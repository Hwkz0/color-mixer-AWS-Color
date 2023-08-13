package storage;

import color_service.ColorCreator;

import java.awt.*;

public class ColorArrayInserter {

    public static Color[] insertColorIntoArray(int insertColorIntoArrayQuantity, Color[] insertColorArray) {

        //for loop to insert user specified number of colors
        for (int i = 0; i < insertColorIntoArrayQuantity; i++) {
            insertColorArray[i] = ColorCreator.createColor();
        }

        return insertColorArray;

    }
}
