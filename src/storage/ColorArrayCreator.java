    package storage;

    import java.awt.*;

    import static userinterface.ColorPaletteSize.colorPaletteSize;

    /**
     * Utility class for creating arrays of colors.
     */

    public class ColorArrayCreator {

        /**
         * Creates an array of colors with the specified size.
         *
         * @param createdColorArraySize The size of the array to be created.
         * @return An array of colors with the specified size.
         */

        public static Color[] createColorArray(int createdColorArraySize) {

            //creates an array of the size the user entered

            return new Color[createdColorArraySize];
        }

    }
