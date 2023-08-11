package color_service;

public class ColorVerifier {

    public static boolean verifyColorValue(int verifyColorValue) {

        if (verifyColorValue >= 0 && verifyColorValue <= 255) {
            return true;
        } else {
            return false;
        }

    }

}
