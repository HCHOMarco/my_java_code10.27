package Circle;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle =new Circle();
        System.out.printf("the radius of the circle is %f\n",circle.getRadius());
        circle.printArea();

        circle.setRadius(10);
        System.out.printf("the radius of the circle is %f\n",circle.getRadius());
        circle.printArea();
    }
}
