import java.util.Scanner;

public class Employee {
    int iD;
    String name;
    String position;
    String address;
    double salary;
    Scanner sc = new Scanner(System.in);

    public Employee(int iD, String name, String position, String address, double salary) {
        this.iD = iD;
        this.name = name;
        this.position = position;
        this.address = address;
        this.salary = salary;
    }

    public Employee() {
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void input() {
        System.out.println("Nhập id: ");
        this.setiD(Integer.valueOf(sc.nextLine()));
        System.out.println("Nhập tên: ");
        this.setName(sc.nextLine());
        System.out.println("Nhập chức vụ: ");
        this.setPosition(sc.nextLine());
        System.out.println("Nhập địa chỉ: ");
        this.setAddress(sc.nextLine());
        System.out.println("Nhập lương: ");
        this.setSalary(Double.parseDouble(sc.nextLine()));

    }

    public void display() {
        System.out.println("id: " + this.getiD());
        System.out.println("Tên: " + this.getName());
        System.out.println("Chức vụ: " + this.getPosition());
        System.out.println("Địa chỉ: " + this.getAddress());
        System.out.println("Lương: " + this.salary);

    }

    public String toString() {
        return iD + " " + name + " " + position + " " + address + " " + salary;
    }
}
