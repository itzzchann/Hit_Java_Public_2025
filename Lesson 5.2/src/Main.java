import Tools.PhongMay;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<PhongMay> danhSachPhong = new ArrayList<>();
        System.out.print("Nhập số lượng phòng máy: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("=== Nhập thông tin phòng thứ " + (i + 1) + " ===");
            PhongMay pm = new PhongMay();
            pm.nhap();
            danhSachPhong.add(pm);
        }
        System.out.println("\n=== Danh sách các phòng máy ===");
        for (int i = 0; i < danhSachPhong.size(); i++) {
            System.out.println("Phòng máy " + (i + 1));
            danhSachPhong.get(i).xuat();
            System.out.println("-----------------------------");
        }
    }
}
