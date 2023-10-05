import java.lang.StringBuilder;

public class Circle extends Shape {
    private double radius;
    private double PI = Math.PI;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }

     public double getArea() {
        return Math.PI * (radius*radius);
    }

    public void setArea(double area) {
        area = this.getArea();
    }

    public double getPerimeter() {
        return (2 * PI) * radius;
    }

    public void setPerimeter(double area) {
        area = this.getPerimeter();
    }

    public boolean equals(Circle second)
    {
        return this.getArea() == second.getArea();
    }

    public double compareTo(Circle second)
    {
        return this.getArea() - second.getArea();
    }

    public String toString() {
        StringBuilder result = new StringBuilder(super.toString());
        result.append("Radius: ");
        result.append(getRadius());
        result.append(", Area: ");
        result.append(getArea());
        result.append("Circumference: ");
        result.append(getPerimeter());
        return result.toString();
    }
    
}
