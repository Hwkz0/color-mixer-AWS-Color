package color_service;

import java.util.Scanner;


public class ColorReader {

    static Scanner colorScanner = new Scanner(System.in);

    public static int readColorValue(String colorName) {

        int readColorValue;

        System.out.print("Enter " + colorName + " value: ");

        readColorValue = colorScanner.nextInt();

        return readColorValue;

    }

}
