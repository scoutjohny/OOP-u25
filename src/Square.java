public class Square extends Shape{
    double a;
    public Square(double positionX, double positionY, String color, String name, double a) {
        super(positionX, positionY, color, name);
        this.a = a;
    }

    @Override
    public void area() {
        System.out.println("Area of the square with the side of length: " + a + " is: "+(a*a));
    }

    @Override
    public void circumference() {
        System.out.println("Circumference of the square with the side of length: " + a + " is: "+(4*a));
    }
}
