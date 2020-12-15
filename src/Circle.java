// Written by xion1884

import java.awt.*;
import java.lang.Math;

public class Circle{
    public double x;
    public double y;
    public double radius;
    public Color colour;

    public Circle(double initX, double initY, double initRad) {
        this.x = initX;
        this.y = initY;
        this.radius = initRad;
    } // constructor

    public Circle() {} // default constructor

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    } // calculatedPerimeter

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    } // calculatedArea

    public void setColor(Color color) {
        colour = color;
    } // setColor

    public void setPos(double setX, double setY) {
        x = setX;
        y = setY;
    } // setPos

    public void setRadius(double setRad) {
        radius = setRad;
    } // setRadius

    public Color getColor() {
        return colour;
    } // getColor

    public double getXPos() {
        return x;
    } // getXPos

    public double getYPos() {
        return y;
    } // getYPos

    public double getRadius() {
        return radius;
    } // getRadius
} // Circle class