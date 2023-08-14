package userinterface;

import color_service.ColorValueVerifier;

import java.util.Scanner;


public class ColorReader {

    static Scanner colorScanner = new Scanner(System.in);

    public static int readColorValue(String colorName) {

        int readColorValue;

        System.out.print("Enter " + colorName + " value: ");

        readColorValue = colorScanner.nextInt();

        return ColorValueVerifier.verifyColorValue(colorName, readColorValue);

    }

}
