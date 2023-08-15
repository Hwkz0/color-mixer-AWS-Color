package userinterface;

import java.util.Scanner;

import static color_service.ReadValidString.readValidString;
import static color_service.ReadValidString.readValidString;

public class MixAgainPrompt {
    
    static Scanner mixAgainScanner = new Scanner(System.in);
    
    
    public static boolean mixAgainPrompt() {
        
        boolean mixAgain;
        
        System.out.print("Would you like to mix another color? (y/n) ");
        
        String mixAgainString = readValidString();

        mixAgain = mixAgainString.equals("y");

        return mixAgain;
        
    }
    
}
