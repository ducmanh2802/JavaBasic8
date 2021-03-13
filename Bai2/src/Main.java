import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng tài liệu: ");
        int n = sc.nextInt();
        ArrayList<Sach> listSach = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Loại sách nào bạn muốn nhập?(1- SGK, 2 - Đồ án, 3 - Tài liệu điện tử)");
            int selection = sc.nextInt();
            if (selection == 1) {
                //SGK
                SachGiaoKhoa sachGiaoKhoa = new SachGiaoKhoa();
                sachGiaoKhoa.input();
                listSach.add(sachGiaoKhoa);
                File sgk = new File("sgk.txt");
                sgk.createNewFile();
                FileWriter fileWriter = new FileWriter("sgk.txt");
                fileWriter.write(sachGiaoKhoa.toString());
            } else if (selection == 2) {
                //Đồ án
                DoAn doAn = new DoAn();
                doAn.input();
                listSach.add(doAn);
                File da = new File("da.txt");
                da.createNewFile();
                FileWriter fileWriter = new FileWriter("da.txt");
            } else if (selection == 3) {
                //Tài liệu điện tử
                TaiLieuDienTu taiLieuDienTu = new TaiLieuDienTu();
                taiLieuDienTu.input();
                listSach.add(taiLieuDienTu);
                File tldt = new File("tldt.txt");
                tldt.createNewFile();
                FileWriter fileWriter = new FileWriter("tldt.txt");
            } else {
                System.out.println("Giá trị ko hợp lệ!");
            }

        }
        Scanner readSGK = new Scanner("sgk.txt");
        Scanner readDA = new Scanner("da.txt");
        Scanner readTLDT = new Scanner("tldt.txt");
        readSGK.nextLine();
        readDA.nextLine();
        readTLDT.nextLine();

    }
}
