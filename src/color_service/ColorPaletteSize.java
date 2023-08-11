package color_service;

import java.util.Scanner;

public class ColorPaletteSize {

    static Scanner colorPaletteSizeScanner = new Scanner(System.in);

    public static int colorPaletteSize() {

        int colorPaletteSize;

        System.out.print("How many colors do you want to store: ");

        colorPaletteSize = colorPaletteSizeScanner.nextInt();

        while (colorPaletteSize < 1) {

            System.out.println("Please enter a number greater than 0.");

            System.out.print("How many colors do you want to store: ");

            colorPaletteSize = colorPaletteSizeScanner.nextInt();

        }

        return colorPaletteSize;

    }

}
