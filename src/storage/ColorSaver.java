package storage;

import java.awt.*;

import static color_service.ColorPaletteShow.showColorPalette;
import static userinterface.ColorPositionPrompt.colorPositionPrompt;
import static userinterface.ColorSavePrompt.colorSavePrompt;

public class ColorSaver {

    public static Color[] saveColor(Color savedColor, Color[] saveColorArray) {

        boolean saveColor= colorSavePrompt();

        if (saveColor){
            int colorArrayPosition = colorPositionPrompt();
            saveColorArray[colorArrayPosition] = savedColor;
        }

        showColorPalette(saveColorArray);

        return saveColorArray;
    }

}
