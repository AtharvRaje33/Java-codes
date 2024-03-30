import java.util.Scanner;

abstract class Diagram {
    abstract void input();
    abstract double area();
    abstract double volume();
}

class Square extends Diagram {
    double side;

    @Override
    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        side = scanner.nextDouble();
    }

    @Override
    double area() {
        return side * side;
    }

    @Override
    double volume() {
        return 0;
    }
}

class Rectangle extends Diagram {
    double length, width;

    @Override
    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        width = scanner.nextDouble();
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    double volume() {
        return 0; 
    }
}

class Cube extends Diagram {
    double side;

    @Override
    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the cube: ");
        side = scanner.nextDouble();
    }

    @Override
    double area() {
        return 6 * side * side;
    }

    @Override
    double volume() {
        return side * side * side;
    }
}

public class Main {
    public static void main(String[] args) {
        Diagram square = new Square();
        square.input();
        System.out.println("Area of the square: " + square.area());

        Diagram rectangle = new Rectangle();
        rectangle.input();
        System.out.println("Area of the rectangle: " + rectangle.area());

        Diagram cube = new Cube();
        cube.input();
        System.out.println("Area of the cube: " + cube.area());
        System.out.println("Volume of the cube: " + cube.volume());
    }
}
