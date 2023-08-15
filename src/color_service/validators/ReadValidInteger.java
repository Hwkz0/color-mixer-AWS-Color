package color_service.validators;

import java.util.Scanner;

/**
 * Validator class for reading and validating integers from user input.
 */

public class ReadValidInteger {

    static Scanner validIntegerScanner = new Scanner(System.in);

    /**
     * Reads and validates an integer from the user input.
     *
     * @return The valid integer entered by the user.
     */

    public static int readValidInteger() {

        int validInteger;

        //verify that the user entered an integer
        while (!validIntegerScanner.hasNextInt()) {
            System.out.println("Please enter a valid integer.");
            validIntegerScanner.next();
        }

        //if the user entered an integer, assign it to the validInteger variable
        validInteger = validIntegerScanner.nextInt();

        //return the valid integer
        return validInteger;

    }

}
