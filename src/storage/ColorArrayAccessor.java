package storage;

import java.awt.*;

public class ColorArrayAccessor {

    public static Color getColorFromArray(int accessColorArrayPosition, Color[] accessColorFromArray ) {

        //returns the color the user asks for

        return accessColorFromArray[accessColorArrayPosition];


//        return ColorArrayCreator.getColorArray(retrievedColor);

    }
}
