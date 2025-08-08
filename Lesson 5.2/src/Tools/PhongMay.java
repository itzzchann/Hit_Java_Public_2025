package Tools;

import java.util.ArrayList;
import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private double dienTich;
    private QuanLy x;
    private ArrayList<May> danhSachMay = new ArrayList<>();

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã phòng: ");
        maPhong = sc.nextLine();
        System.out.print("Nhập tên phòng: ");
        tenPhong = sc.nextLine();
        System.out.print("Nhập diện tích: ");
        dienTich = sc.nextDouble();
        sc.nextLine();

        x = new QuanLy();
        System.out.println("== Nhập thông tin quản lý ==");
        x.nhap();

        System.out.print("Nhập số lượng máy: ");
        int soMay = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < soMay; i++) {
            System.out.println("== Nhập thông tin máy thứ " + (i + 1) + " ==");
            May may = new May();
            may.nhap();
            danhSachMay.add(may);
        }
    }

    public void xuat() {
        System.out.println("Mã phòng: " + maPhong);
        System.out.println("Tên phòng: " + tenPhong);
        System.out.println("Diện tích: " + dienTich);
        System.out.println("== Thông tin quản lý ==");
        x.xuat();
        System.out.println("== Danh sách máy ==");
        for (int i = 0; i < danhSachMay.size(); i++) {
            System.out.println("Máy thứ " + (i + 1) + ":");
            danhSachMay.get(i).xuat();
        }
    }
}
