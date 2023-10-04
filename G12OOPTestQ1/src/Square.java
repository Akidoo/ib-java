public class Square extends Shape {
    private double side;

    public Square(String name, double side) {
        super(name);
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    
    public void setSide(double side) {
        this.side = side;
    }

     public double getArea() {
        return side * side;
    }

    public void setArea(double area) {
        area = this.getArea();
    }

    public double getPerimeter() {
        return 4 * side;

        
    }
     public void setPerimeter(double area) {
        area = this.getPerimeter();
    }

    public boolean equals(Square second)
    {
        return this.getArea() == second.getArea();
    }

    public double compareTo(Square second)
    {
        return this.getArea() - second.getArea();
    }

    public String toString() {
        return super.toString() + "Side: " + getSide() + ", Area: " + getArea() + "Perimeter: " + getPerimeter();
    }
    
}
