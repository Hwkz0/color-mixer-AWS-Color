package model;

import java.awt.Color;

import color_service.ColorReader;

public class Color {

    int redValue, int greenValue, int blueValue

    // Create a new color object

    public Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    // Read the red, green, and blue values

    redValue= readColorValue("red");

    greenValue = readColorValue("green");

    blueValue = readColorValue("blue");

    // Create a new color object

    Color color = new Color(redValue, greenValue, blueValue);


}
