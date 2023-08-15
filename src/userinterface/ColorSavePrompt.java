package userinterface;

import java.util.Scanner;

import static color_service.ReadValidString.readValidString;

public class ColorSavePrompt {

    static Scanner colorSavePromptScanner = new Scanner(System.in);

    public static boolean colorSavePrompt() {

        boolean colorSave;

        System.out.print("Would you like to save this color? (y/n) ");

        String colorSaveString = readValidString();

        colorSave = colorSaveString.equals("y");

        return colorSave;

    }

}
