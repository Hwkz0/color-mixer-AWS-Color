package color_service.validators;

import java.util.Scanner;

/**
 * Validator class for reading and validating strings from user input.
 */

public class ReadValidString {

    static Scanner validStringScanner = new Scanner(System.in);

    /**
     * Reads and validates a string from the user input.
     *
     * @return The valid string entered by the user.
     */

    public static String readValidString() {

        String validString = null;

        //verify that the user entered a string
        while (true){

            //if the user entered a string, assign it to the validString variable
            validString= validStringScanner.next();

            //return the valid string only if it is "y" or "n"
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
