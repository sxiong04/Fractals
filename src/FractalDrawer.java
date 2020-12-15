// Written by xion1884

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class FractalDrawer {
    private double totalArea = 0;

    public FractalDrawer() {} // default constructor

    public double drawFractal(String type) {
        Scanner in = new Scanner(System.in);
        System.out.print("What level would you like the fractal to be in: ");
        String level = in.nextLine();
        if (type.toLowerCase().equals("triangle")) {
            drawTriangleFractal(1920, 1080, 0, 1080, new Color(randomInt(0, 255), randomInt(0, 255), randomInt(0, 255)), new Canvas(1080, 1920), Integer.parseInt(level));
        }
        else if (type.toLowerCase().equals("rectangle")) {
            drawRectangleFractal(250, 500, 800, 300, new Color(randomInt(0, 255), randomInt(0, 255), randomInt(0, 255)), new Canvas(1080, 1920), Integer.parseInt(level));
        }
        else if (type.toLowerCase().equals("circle")) {
            drawCircleFractal(200, 960, 510, new Color(randomInt(0, 255), randomInt(0, 255), randomInt(0, 255)), new Canvas(1080, 1920), Integer.parseInt(level));
        }
        return totalArea;
    } // drawFractal

    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        Triangle fractal = new Triangle(x, y, width, height);
        fractal.setColor(c);
        can.drawShape(fractal);
        totalArea += fractal.calculateArea();
        c = new Color(randomInt(0, 255), randomInt(0, 255), randomInt(0, 255));
        if (level > 0) {
            drawTriangleFractal(width/ 2, height/2, x, y, c, can, level - 1);
            drawTriangleFractal(width/2, height / 2, x + (width / 2), y, c, can, level -1 );
            drawTriangleFractal(width/2, height / 2, x + (width / 4), y - (height / 2), c, can, level -1 );
        }
    } // drawTriangleFractal

    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
        Circle fractal = new Circle(x, y, radius);
        fractal.setColor(c);
        can.drawShape(fractal);
        totalArea += fractal.calculateArea();
        c = new Color(randomInt(0, 255), randomInt(0, 255), randomInt(0, 255));
        if (level > 0) {
            drawCircleFractal(radius/2, x - radius, y, c, can, level - 1);
            drawCircleFractal(radius/ 2, x + radius, y, c, can, level - 1);
            drawCircleFractal(radius / 2, x, y + radius, c, can, level -1);
            drawCircleFractal(radius / 2, x, y - radius, c, can, level - 1);
        }
    } // drawCircleFractal

    public void drawRectangleFractal (double width, double height, double x, double y, Color c, Canvas can, int level) {
        Rectangle fractal = new Rectangle(x, y, width, height);
        fractal.setColor(c);
        can.drawShape(fractal);
        totalArea += fractal.calculateArea();
        c = new Color(randomInt(0, 255), randomInt(0, 255), randomInt(0, 255));
        if (level > 0) {
            drawRectangleFractal(width / 2, height / 2, x + width, y + height, c, can, level - 1);
            drawRectangleFractal(width / 2, height / 2, x - (width / 2), y + height, c, can, level - 1);
            drawRectangleFractal(width / 2, height / 2, x + width, y - (height / 2), c, can, level - 1);
            drawRectangleFractal(width / 2, height / 2 ,x - (width / 2), y - (height / 2), c, can, level - 1);
        }
    } // drawRectangleFractal

    public static int randomInt(int min, int max) {
        Random randInt = new Random();
        return randInt.nextInt((max - min) - 1) + min;
    } // randomInt

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Which fractal would you like to make? triangle/rectangle/circle: ");
        String type = in.nextLine();
        FractalDrawer draw = new FractalDrawer();
        System.out.println("Total Area of The Fractal: " + draw.drawFractal(type));
    } // main
}
