package storage;

import color_service.ColorCreator;

import java.awt.*;

public class ColorArrayInserter {

    public static Color[] insertColorIntoArray(int insertColorIntoArrayQuantity, Color[] insertColorArray) {

        for (int i = 0; i < insertColorIntoArrayQuantity; i++) {
            insertColorArray[i] = ColorCreator.createColor();
        }

        return insertColorArray;

//
//        creates as many colors as the user entered and stores them in the array
//        for(int i= 0; i < colorArraySize; i++) {
//            colorArray[i]= ColorCreator.createColor();
//        }
//

    }
}
