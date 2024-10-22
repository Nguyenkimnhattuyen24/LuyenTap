package managemanprogram;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Geometric implements IIgeometric {

    String color;
    boolean filled;
    Date dateCreated;
    String name;
    Scanner scanner = new Scanner(System.in);

    public Geometric(String color, boolean filled, Date dateCreated, String name) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = dateCreated;
        this.name = name;
    }

    public Geometric() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void input() {
        System.out.print("Enter name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter color: ");
        this.color = scanner.nextLine();

        System.out.print("Is the shape filled? (true/false): ");
        boolean filled = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("Enter date :");
        String dateString = scanner.nextLine();
        this.dateCreated = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        try {
//           Date date = sdf.parse(dateString);
//        } catch (Exception e) {
//            System.out.println("Wrong format");
//        }
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Geometric{" + "color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated + ", name=" + name + ", scanner=" + scanner + '}';
    }

}
