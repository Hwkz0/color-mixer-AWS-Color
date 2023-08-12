import java.awt.*;

import static model.Color.colorSetUp;

public class Main {

    public static void main(String[] args) {

        colorSetUp();

        // Create a new frame

        Frame frame = new Frame();
        frame.setSize(500, 500);

        // Set the background color of the frame the color object
        //to be implemented back after color model is finished

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
