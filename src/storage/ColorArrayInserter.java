package storage;

import color_service.ColorCreator;

import java.awt.*;

/**
 * Storage class for inserting colors into an array.
 */

public class ColorArrayInserter {

    /**
     * Inserts the specified quantity of colors created by ColorCreator into the provided array.
     *
     * @param insertColorIntoArrayQuantity The quantity of colors to insert into the array.
     * @param insertColorArray The array into which colors will be inserted.
     * @return The array with inserted colors.
     */

    public static Color[] insertColorIntoArray(int insertColorIntoArrayQuantity, Color[] insertColorArray) {

        //inserts the specified quantity of colors into the array
        for (int i = 0; i < insertColorIntoArrayQuantity; i++) {
            insertColorArray[i] = ColorCreator.createColor();
        }

        //returns the array with inserted colors
        return insertColorArray;

    }
}
