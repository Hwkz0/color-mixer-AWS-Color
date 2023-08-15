package color_service;

import java.util.Scanner;

public class ReadValidInteger {

    static Scanner validIntegerScanner = new Scanner(System.in);

    public static int readValidInteger() {

        int validInteger;

        while (!validIntegerScanner.hasNextInt()) {
            System.out.println("Please enter a valid integer.");
            validIntegerScanner.next();
        }

        validInteger = validIntegerScanner.nextInt();

        return validInteger;

    }

}
