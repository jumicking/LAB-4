package malilong_jumayca.rose_circlelab;

class Circle {

    // Attribute
    private double radius;

    // Default Constructor
    public Circle() {
        this.radius = 1.0; // Default radius
    }

    // Parameterized Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to calculate diameter
    public double getDiameter() {
        return 2 * radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius 
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
