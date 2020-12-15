// Written by xion1884

import java.awt.*;

public class Rectangle {
    public double x;
    public double y;
    public double width;
    public double height;
    public Color color;

    public Rectangle(double initX, double initY, double initWidth, double initHeight) {
        this.x = initX;
        this.y = initY;
        this.width = initWidth;
        this.height = initHeight;
    } // constructor

    public Rectangle() {} // default constructor

    public double calculatePerimeter() {
        return 2 * width + 2 * height;
    } // calculatePerimeter

    public double calculateArea() {
        return width * height;
    } // calculateArea

    public void setColor(Color colour) {
        color = colour;
    } // setColor

    public void setPos(double setX, double setY) {
        x = setX;
        y = setY;
    } // setPos

    public void setHeight(double setHeight) {
        height = setHeight;
    } // setHeight

    public void setWidth(double setWidth) {
        width = setWidth;
    } // setWidth

    public Color getColor() {
        return color;
    } // getColor

    public double getXPos() {
        return x;
    } // getXPos

    public double getYPos() {
        return y;
    } // getYPos

    public double getHeight() {
        return height;
    } // getHeight

    public double getWidth() {
        return width;
    } // getWidth
}
