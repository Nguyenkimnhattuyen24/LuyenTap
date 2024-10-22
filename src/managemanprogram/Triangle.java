package managemanprogram;

import java.util.Date;
import java.util.Scanner;

public class Triangle extends Geometric {

    private double A, B, C;
    Scanner sc = new Scanner(System.in);

    public Triangle(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public Triangle() {
    }

    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public double getB() {
        return B;
    }

    public void setB(double B) {
        this.B = B;
    }

    public double getC() {
        return C;
    }

    public void setC(double C) {
        this.C = C;
    }

    @Override
    public double getArea() {
        double s = (A + B + C) / 2;  // Bán chu vi
        return Math.sqrt(s * (s - A) * (s - B) * (s - C));
    }

    @Override
    public String toString() {
        return "Triangle{" + "A=" + A + ", B=" + B + ", C=" + C + ", sc=" + sc + '}';
    }

    @Override
    public void input() {
        super.input();  // Get color, filled, name
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side A: ");
        this.A = sc.nextDouble();
        System.out.print("Enter side B: ");
        this.B = sc.nextDouble();
        System.out.print("Enter side C: ");
        this.C = sc.nextDouble();
    }

    @Override
    public double getPerimeter() {
        return A + B + C;
    }

}
