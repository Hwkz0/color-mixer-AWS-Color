package userinterface;

import java.util.Scanner;

import static color_service.ColorVerifier.verifyColorPaletteSize;

public class StartingColorsSize {

    static Scanner startingColorSizeScanner = new Scanner(System.in);

    public static int startingColorSize(){

        int startingColorSize;

        System.out.print("How many colors do you plan to start with : ");

        startingColorSize = startingColorSizeScanner.nextInt();

        return verifyColorPaletteSize(startingColorSize);

    }

}
