// Written by xion1884

import java.awt.*;

public class Triangle {
    public double x;
    public double y;
    public double width;
    public double height;
    Color color;

    public Triangle(double initX, double initY, double initWidth, double initHeight) {
        this.x = initX;
        this.y = initY;
        this.width = initWidth;
        this.height = initHeight;
    } // constructor

    public Triangle() {} // default constructor

    public double calculatePerimeter() {
        return width + 2 * Math.sqrt(Math.pow(height, 2) + Math.pow(width/2, 2));
    } // calculatePerimeter

    public double calculateArea() {
        return (width * height) / 2;
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
