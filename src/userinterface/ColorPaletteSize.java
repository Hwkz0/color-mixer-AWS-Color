package userinterface;

import java.util.Scanner;

import static color_service.ColorPaletteVerifier.verifyColorPaletteSize;

public class ColorPaletteSize {

    static Scanner colorPaletteSizeScanner = new Scanner(System.in);

    public static int colorPaletteSize() {

        int colorPaletteSize;

        System.out.print("How many colors do you plan to work with : ");

        colorPaletteSize = colorPaletteSizeScanner.nextInt();

        return verifyColorPaletteSize(colorPaletteSize);

    }

}
