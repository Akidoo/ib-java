public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
     public double getWidth() {
        return width;
    }
    
    public void setWidth(double length) {
        this.length = length;
    }

     public double getArea() {
        return length * width;
    }

    public void setArea(double area) {
        area = this.getArea();
    }

    public double getPerimeter() {
        return 2 * (length * width);
    }

    public void setPerimeter(double area) {
        area = this.getPerimeter();
    }

    public boolean Equals(Rectangle second)
    {
        return this.getArea() == second.getArea();
    }

    public double compareTo(Rectangle second)
    {
        return this.getArea() - second.getArea();
    }

      public String toString() {
        return super.toString() + "Length: " + getLength() + "Width: " + getWidth() + "Area: " + getArea() + "Perimeter: " + getPerimeter();
    }
    
    
}
