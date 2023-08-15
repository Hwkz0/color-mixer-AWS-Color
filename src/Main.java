import model.ColorCombine;

import java.awt.*;

import static color_service.MixAgain.mixAgain;
import static model.ColorSetUp.colorSetUp;
import static storage.ColorSaver.saveColor;
import static userinterface.MixAgainPrompt.mixAgainPrompt;
import static userinterface.StartProgramPrompt.startProgramPrompt;

/**
 * Main class to run the color combination application.
 */

public class Main {

    public static void main(String[] args) {

        startProgramPrompt();

        Color[] mainArray = colorSetUp();

        System.out.println("Let's mix some colors!");

        // Create a new frame

        Frame frame = new Frame();
        frame.setSize(500, 500);

        // Set the background color of the frame the color object
        
        Color color = ColorCombine.combineColor(mainArray);

        frame.setBackground(color);

        // Make the frame visible
        frame.setVisible(true);

        saveColor(color, mainArray);

        //mix again
        mixAgain(mainArray, frame);


        //exit on close
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });

    }

}
