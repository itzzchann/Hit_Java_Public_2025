import Tool.Data;
import Tool.Student;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n========= MENU =========");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Sửa sinh viên theo tên");
            System.out.println("4. Xóa sinh viên theo tên");
            System.out.println("5. Sắp xếp theo tuổi");
            System.out.println("6. Sắp xếp theo GPA");
            System.out.println("7. Sắp xếp theo số tiết nghỉ");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Tên: ");
                    String name = sc.nextLine();
                    System.out.print("Năm sinh: ");
                    int year = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Địa chỉ: ");
                    String address = sc.nextLine();
                    System.out.print("Điểm TX1: ");
                    double tx1 = sc.nextDouble();
                    System.out.print("Điểm TX2: ");
                    double tx2 = sc.nextDouble();
                    System.out.print("Điểm KTHP: ");
                    double kthp = sc.nextDouble();
                    System.out.print("Số tiết nghỉ: ");
                    int absent = sc.nextInt();
                    data.addStu(new Student(name, year, address, tx1, tx2, kthp, absent));

                    break;
                case 2:
                    data.show();
                    break;
                case 3:
                    System.out.print("Tên sinh viên cần sửa: ");
                    String fixName = sc.nextLine();
                    System.out.print("Tên mới: ");
                    String newName = sc.nextLine();
                    System.out.print("Năm sinh: ");
                    int newYear = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Địa chỉ: ");
                    String newAddress = sc.nextLine();
                    System.out.print("TX1: ");
                    double newTx1 = sc.nextDouble();
                    System.out.print("TX2: ");
                    double newTx2 = sc.nextDouble();
                    System.out.print("KTHP: ");
                    double newKthp = sc.nextDouble();
                    System.out.print("Nghỉ: ");
                    int newAbsent = sc.nextInt();
                    data.fixStu(fixName, new Student(newName, newYear, newAddress, newTx1, newTx2, newKthp, newAbsent));
                    break;
                case 4:
                    System.out.print("Tên sinh viên cần xóa: ");
                    String delName = sc.nextLine();
                    data.deleteStu(delName);
                    break;
                case 5:
                    data.sortByAge();
                    System.out.println("Đã sắp xếp theo tuổi.");
                    data.show();
                    break;
                case 6:
                    data.sortByGpa();
                    System.out.println("Đã sắp xếp theo GPA.");
                    data.show();
                    break;
                case 7:
                    data.sortByAbsent();
                    System.out.println("Đã sắp xếp theo số tiết nghỉ.");
                    data.show();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");

            }
        }
    }
}
