package Project1;
//Create an Interface ‘Shape’ with undefined methods as calculateArea and calculatePerimiter.
//Create 2 classes Circle & Square that implements functionality defined in the Shape
//  Interface. Test your code.
public interface Shape {

    void  calculateArea(double radius);
    void calculateParameter(double length);


}
class Circle implements Shape{

    @Override
    public void calculateArea(double radius) {
        double piea=3.1415;
        System.out.println("the area of this circle equls "+radius*radius*piea);

    }

    @Override
    public void calculateParameter(double length) {

    }
}
class Squre implements Shape{

    @Override
    public void calculateArea(double radius) {

    }

    @Override
    public void calculateParameter(double length) {
        System.out.println("the parameter of this squre is "+length*4);

    }

    public static void main(String[] args) {
        Shape shape=new Circle();
        shape.calculateArea(32);

        Shape shape1 =new Squre();
        shape1.calculateParameter(23);
    }
}


