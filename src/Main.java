import model.ColorCombine;

import java.awt.*;

import static model.ColorSetUp.colorSetUp;

/**
 * Main class to run the color combination application.
 */

public class Main {

    public static void main(String[] args) {

        Color[] mainArray = colorSetUp();

        // Create a new frame

        Frame frame = new Frame();
        frame.setSize(500, 500);

        // Set the background color of the frame the color object

        Color color = ColorCombine.combineColor(mainArray);
        frame.setBackground(color);

        // Make the frame visible

        frame.setVisible(true);

        //exit on close
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });

    }

}
