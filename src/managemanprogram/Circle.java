package managemanprogram;

import java.util.Date;
import java.util.Scanner;

public class Circle extends Geometric {

    private double R;
    Scanner sc = new Scanner(System.in);

    public Circle(double R, String color, boolean filled, Date dateCreated, String name) {
        super(color, filled, dateCreated, name);
        this.R = R;
    }

    public Circle(double R) {
        this.R = R;
    }

    public Circle() {
    }

    public double getR() {
        return R;
    }

    public void setR(double R) {
        this.R = R;
    }

    @Override
    public void input() {
        super.input();  // Get color, filled, name
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        this.R = sc.nextDouble();
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * R;
    }

    @Override
    public double getArea() {
        return PI * R * R;
    }

    @Override
    public String toString() {
        return "Circle{" + "R=" + R + ", sc=" + sc + '}';
    }

}
