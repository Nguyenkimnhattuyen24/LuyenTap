package managemanprogram;

import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Geometric_List {

    ArrayList<Geometric> geometricList;
    Scanner scanner = new Scanner(System.in);

    public Geometric_List() {
        geometricList = new ArrayList<>();
    }

    public Geometric_List(ArrayList<Geometric> geometricList) {
        this.geometricList = geometricList;
    }

    public ArrayList<Geometric> getGeometricList() {
        return geometricList;
    }

    public void setGeometricList(ArrayList<Geometric> geometricList) {
        this.geometricList = geometricList;
    }

    public void addNew(Geometric geometric) {
        geometricList.add(geometric);
    }

    public void update(String name) {
        for (Geometric g : geometricList) {
            if (g.getName().equals(name)) {
                g.input();
            }
        }
        System.out.println("Not Found !");
    }

    public void Delete(String name) {
        geometricList.removeIf(Geometric -> Geometric.getName().equals(Geometric));
    }

    public Geometric find(String name) {
        for (Geometric g : geometricList) {
            if (g.getName().equals(name));
            return g;
        }
        return null;
    }

    public void Menu() {
        while (true) {
            System.out.println("1. Add New Geometric Object");
            System.out.println("2. Update Geometric Object");
            System.out.println("3. Delete Geometric Object");
            System.out.println("4. Find Geometric Object");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Add Circle\n2. Add Triangle");
                    int type = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Geometric geo = null;
                    if (type == 1) {
                        geo = new Circle(type);
                    } else if (type == 2) {
                        geo = new Triangle();
                    }
                    if (geo != null) {
                        geo.input();
                        addNew(geo);
                    }
                    break;
                case 2:
                    System.out.println("2.Enter update:");
                    String update = scanner.nextLine();
                    update(update);
                    break;
                case 3:
                    System.out.println("3.Enter Delete");
                    String deletename = scanner.nextLine();
                    Delete(deletename);
                case 4:
                    System.out.println("4.Find");
                    String findName = scanner.nextLine();
                    Geometric found = find(findName);
                    if (found != null) {
                        found.input();
                    } else {
                        System.out.println("Not Found");
                    }
                    break;
                case 0:
                    System.out.println("Exitting...");
                    return;
                default:
                    System.out.println("Please Try Again ");
            }
        }
    }
}
