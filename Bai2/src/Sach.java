import java.util.Scanner;

public class Sach {
    int maSach;
    String tenSach;
    String NXB;
    int namXB;
    Scanner sc = new Scanner(System.in);

    public Sach(int maSach, String tenSach, String NXB, int namXB) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.NXB = NXB;
        this.namXB = namXB;
    }

    public Sach() {
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public int getNamXB() {
        return namXB;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }

    public void input() {
        System.out.println("Nhập vào mã sách:");
        this.setMaSach(Integer.valueOf(sc.nextLine()));
        System.out.println("Nhập vào tên sách:");
        this.setTenSach(sc.nextLine());
        System.out.println("Nhập vào nhà xuất bản:");
        this.setTenSach(sc.nextLine());
        System.out.println("Nhập vào năm xuất bản:");
        this.setMaSach(Integer.valueOf(sc.nextLine()));
    }

    public String toString() {
        return maSach + " " + tenSach + " " + NXB + " " + namXB;
    }
}
