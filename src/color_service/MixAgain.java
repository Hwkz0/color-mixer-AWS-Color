package color_service;

import model.ColorCombine;
import userinterface.MixAgainPrompt;

import java.awt.*;

import static storage.ColorSaver.saveColor;
import static userinterface.MixAgainPrompt.mixAgainPrompt;

public class MixAgain {

    public static void mixAgain(Color[] mixAgainArray, Frame frame) {

        boolean mixAgain = mixAgainPrompt();

        while (mixAgain) {

            Color mixAgainColor = ColorCombine.combineColor(mixAgainArray);

            frame.setVisible(true);

            frame.setBackground(mixAgainColor);

            saveColor(mixAgainColor, mixAgainArray);

            mixAgain = MixAgainPrompt.mixAgainPrompt();

        }

        if (!mixAgain) {
            System.exit(0);
        }

    }


}
