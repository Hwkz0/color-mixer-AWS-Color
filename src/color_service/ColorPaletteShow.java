package color_service;

import java.awt.*;

public class ColorPaletteShow {

    public static void showColorPalette(Color[] showColorPaletteArray) {

        for (int i = 0; i < showColorPaletteArray.length; i++) {
            System.out.println("Position "+(i+1)+" "+showColorPaletteArray[i]);
        }

    }


}
