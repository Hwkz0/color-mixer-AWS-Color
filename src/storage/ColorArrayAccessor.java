package storage;

import static userinterface.ColorSelector.selectColor;

public class ColorArrayAccessor {

    public static int[] getColorFromArray() {

        int retrievedColor = selectColor();

        //to be implemented



        return storage.ColorArray.getColorArray(retrievedColor);

    }
}
