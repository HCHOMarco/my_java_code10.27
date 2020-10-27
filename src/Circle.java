public class Circle {
    double radius;
    static int numberOfObjects = 0;
    Circle(){
        numberOfObjects++;
    }
    Circle(double radius){
        this.radius=radius;
        numberOfObjects++;
    }

    static int getNumberOfObjects(){
        return numberOfObjects;
    }

    double getArea(){
        return radius*radius*Math.PI;
    }
}
