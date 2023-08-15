package userinterface;

import java.util.Scanner;

import static color_service.ReadValidInteger.readValidInteger;

public class ColorPositionPrompt {

    static Scanner colorPositionScanner = new Scanner(System.in);


    public static int colorPositionPrompt() {

        int colorPosition;

        System.out.print("What position in the color palette would you like to save this color to? ");

        colorPosition = readValidInteger();

        return colorPosition-1;

    }


}
