import model.ColorCombine;

import java.awt.*;

import static color_service.MixAgain.mixAgain;
import static model.ColorSetUp.colorSetUp;
import static storage.ColorSaver.saveColor;
import static userinterface.informative.StartProgram.startProgramPrompt;


/**
 * Main class to run the color combination application.
 */

public class Main {

    public static void main(String[] args) {

        //start program welcome message
        startProgramPrompt();

        //set up color array
        Color[] mainArray = colorSetUp();

        System.out.println("Let's mix some colors!");

        //create a new frame
        Frame frame = new Frame();
        frame.setSize(500, 500);

        //set the background color of the frame the color object
        
        Color color = ColorCombine.combineColor(mainArray);

        frame.setBackground(color);

        //make the frame visible
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
