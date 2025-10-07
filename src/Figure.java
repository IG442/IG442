interface Figure {
    double calculateArea();
    double calculatePerimeter();

    String getFillColor();
    String getBorderColor();

    default void printCharacteristics() {
        System.out.println("Периметр: " + String.format("%.2f", calculatePerimeter()) +
                ", Площадь: " + String.format("%.2f", calculateArea()) +
                ", Цвет заливки: " + getFillColor() +
                ", Цвет границы: " + getBorderColor());
    }
}