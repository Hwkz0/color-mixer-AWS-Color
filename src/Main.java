import java.awt.*;
import java.util.Scanner;

import color_service.ColorPaletteSize;
import color_service.ColorReader;
import model.ColorCreator;

public class Main {

    public static void main(String[] args) {


        int paletteSize;

        paletteSize= ColorPaletteSize.colorPaletteSize();

        // Create a new color object

        Color color1 = ColorCreator.createColor();


        Color color2 = ColorCreator.createColor();

        // Create a new frame

        Frame frame = new Frame();
        frame.setSize(500, 500);

        // Set the background color of the frame the color object

        frame.setBackground(color1);

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
