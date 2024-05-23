public class Shape {
    double positionX;
    double positionY;
    String color;
    String name;

    public Shape(double positionX, double positionY, String color, String name){
        this.positionX = positionX;
        this.positionY = positionY;
        this.color = color;
        this.name = name;
    }
    public void area(){
        System.out.println("This shape has an area!");
    }

    public void circumference(){
        System.out.println("This shape has a circumference!");
    }
}
