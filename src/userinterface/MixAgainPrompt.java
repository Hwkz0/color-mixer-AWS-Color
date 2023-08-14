package userinterface;

import java.util.Scanner;

public class MixAgainPrompt {
    
    static Scanner mixAgainScanner = new Scanner(System.in);
    
    
    public static boolean mixAgainPrompt() {
        
        boolean mixAgain;
        
        System.out.print("Would you like to mix another color? (y/n) ");
        
        String mixAgainString = mixAgainScanner.next();

        mixAgain = mixAgainString.equals("y");
        
        return mixAgain;
        
    }
    
}
