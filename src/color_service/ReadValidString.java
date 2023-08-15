package color_service;

import java.util.Scanner;

public class ReadValidString {

    static Scanner validStringScanner = new Scanner(System.in);

    public static String readValidString() {

        String validString = null;

        while (true){
            validString= validStringScanner.next();

            if(validString.equals("y") || validString.equals("n")){
                break;
            }
            else{
                System.out.println("Please enter a valid string.");
            }
        }

        return validString;

    }

}
