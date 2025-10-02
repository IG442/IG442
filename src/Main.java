interface Figure {
    double getPerimeter();

    double getArea();

    String getFillColor();

    String getBorderColor();

    default void printInfo() {
        System.out.println("[Периметр = " + getPerimeter() + ", площадь = " + getArea() + ", цвет фона = " + getFillColor() + ", цвет границ = " + getBorderColor() + "]");
    }
}

class Circle implements Figure {
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

class Rectangle implements Figure {
    private double width;
    private double height;
    private String fillColor;
    private String borderColor;

    public Rectangle(double width, double height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

class Triangle implements Figure {
    private double a, b, c;
    private String fillColor;
    private String borderColor;

    public Triangle(double a, double b, double c, String fillColor, String borderColor) {
        if (a + b > c && a + c > b && b + c > a) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            throw new IllegalArgumentException("Треугольник с такими сторонами невозможен");
        }
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

public class Main {
    public static void main(String[] args) {
        Figure[] figures = {new Circle(5, "Белый", "Черный"), new Rectangle(10, 5, "Красный", "Зеленый"), new Triangle(3, 4, 5, "Синий", "Белый")};

        for (Figure figure : figures) {
            figure.printInfo();
        }
    }
}