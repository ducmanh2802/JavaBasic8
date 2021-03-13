import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Employee> listEmployees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        //Nhập
        System.out.println("Nhập vào số nhân viên");
        int n = Integer.valueOf(sc.nextLine());
        for (int i = 0; i < n; i++) {
            Employee employee = new Employee();
            employee.input();
            listEmployees.add(employee);
        }

        //Hiển thị
        for (int i = 0; i < listEmployees.size(); i++) {
            listEmployees.get(i).display();
        }

        System.out.println("Nhập vào hành động bạn muốn làm(1 - chèn thêm, 2 - xóa nhân viên, 3 - sửa, 4 - lưu thông tin)");
        int selection = sc.nextInt();
        if (selection == 1) {
            //Chèn
            System.out.println("Nhập vào vị trí cần chèn");
            int positionInsert = sc.nextInt();
            System.out.println("Nhập thông tin nhân viên cần chèn");
            Employee employee1 = new Employee();
            employee1.input();
            for (int i = 0; i < listEmployees.size(); i++) {
                if (i == positionInsert) {
                    listEmployees.add(employee1);
                }
            }
        } else if (selection == 2) {
            //xóa
            System.out.println("Bạn muốn xóa nhân viên theo tên hay mã nhân viên chọn 1 nếu là tên nv, 2 nếu là mã nv");
            int positionDelete = Integer.valueOf(sc.nextLine());
            if (positionDelete == 1) {
                System.out.println("Nhập tên nhân viên muốn xóa");
                String nameDelete = sc.nextLine();
                for (int i = 0; i < listEmployees.size(); i++) {
                    if (listEmployees.get(i).getName().equals(nameDelete)) {
                        listEmployees.remove(i);
                    }
                }
            } else if (positionDelete == 2) {
                System.out.println("Nhập mã nhân viên muốn xóa");
                int iDDelete = sc.nextInt();
                for (int i = 0; i < listEmployees.size(); i++) {
                    if (listEmployees.get(i).getiD() == iDDelete) {
                        listEmployees.remove(i);
                    }
                }
            } else {
                System.out.println("Lựa chọn này ko được hỗ trợ");
            }
        } else if (selection == 3) {
            //Sửa
            System.out.println("Bạn muốn sửa tên nhân viên nào? ");
            String nameEdit = sc.nextLine();
            System.out.println("Bạn muốn sửa tên nhân viên nào thành tên nào? ");
            String nameEdited = sc.nextLine();
            for (int i = 0; i < listEmployees.size(); i++) {
                if (listEmployees.get(i).getName().equals(nameEdit)) {
                    listEmployees.get(i).setName(nameEdited);
                }
            }
        } else if (selection == 4) {
            //tạo file lưu thông tin nhân viên
            File employeeInfo = new File("C:\\Users\\Duc Manh\\Documents\\Techmaster\\NhanVien.txt");
            employeeInfo.createNewFile();
            FileWriter fileWriter = new FileWriter("C:\\Users\\Duc Manh\\Documents\\Techmaster\\NhanVien.txt");
            fileWriter.write(listEmployees.toString());
            fileWriter.close();
        } else {
            System.out.println("Giá trị ko hợp lệ!");
        }


    }
}
