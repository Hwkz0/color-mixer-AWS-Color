package color_service;


import java.util.Scanner;

public class ColorVerifier {

    static Scanner verifierScanner = new Scanner(System.in);

    public static int verifyColorValue(String verifyColorName, int verifyColorValue) {

        //also if it s needed to use a boolean method
        //return verifyColorValue >= 0 && verifyColorValue <= 255;


        //verify that the color value is between 0 and 255
        while (verifyColorValue < 0 || verifyColorValue > 255) {

            System.out.println("Invalid " + verifyColorName + " value. Please enter a value between 0 and 255.");

            System.out.print("Enter " + verifyColorName + " value: ");

            verifyColorValue = verifierScanner.nextInt();

        }

        //return the verified color value
        return verifyColorValue;

    }

    public static int verifyColorPaletteSize(int verifyColorPaletteSize) {

        //verify that the color palette size is greater than 0
        while (verifyColorPaletteSize < 1) {

            System.out.println("Please enter a number greater than 0.");

            System.out.print("How many colors do you want to store: ");

            verifyColorPaletteSize = verifierScanner.nextInt();

        }

        //return the verified color palette size
        return verifyColorPaletteSize;

    }

}
