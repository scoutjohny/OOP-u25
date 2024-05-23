public class Circle extends Shape{
    double halfRadius;
    final double  pi = 3.14;

    public Circle(double positionX, double positionY, String color, String name, double halfRadius) {
        super(positionX, positionY, color, name);
        this.halfRadius = halfRadius;
    }

    @Override
    public void area() {
        System.out.println("Area of the circle with half radius of: " + halfRadius + " is: "+(halfRadius*halfRadius*pi));
    }

    @Override
    public void circumference() {
        System.out.println("Circumference of the circle with half radius of: " + halfRadius+" is: "+(2*halfRadius*pi));
    }
}
