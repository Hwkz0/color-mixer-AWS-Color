package userinterface;

import java.util.Scanner;

public class ColorSelector {

    static Scanner colorSelectorScanner = new Scanner(System.in);

    public static int selectColor() {

        int selectedColor;

        System.out.print("Select a color: ");

        selectedColor = colorSelectorScanner.nextInt();

        return selectedColor;

    }


}
