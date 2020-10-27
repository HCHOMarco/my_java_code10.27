package Circle;

public class Circle {
    private double radius;

    Circle(){
        radius=1;
    }

    Circle(double radius){
        this.radius=radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    public void printArea(){
        System.out.printf("The area of the circle is %f\n",getArea());
    }

}
