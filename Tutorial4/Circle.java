import java.util.Scanner;

class Circle {
    double radius;

   
    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return 3.14 * radius * radius;
    }

    double circumference() {
        return 2 * 3.14 * radius;
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();

        Circle c = new Circle(r);

        System.out.println("Area = " + c.area());
        System.out.println("Circumference = " + c.circumference());

        sc.close();
    }
}
