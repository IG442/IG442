class Triangle implements Figure {
    private final double base;
    private final double height;
    private final String fillColor;
    private final String borderColor;

    public Triangle(double base, double height, String fillColor, String borderColor) {
        this.base = base;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public double calculatePerimeter() {
        double side = Math.sqrt((base / 2) * (base / 2) + height * height);
        return base + 2 * side;
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