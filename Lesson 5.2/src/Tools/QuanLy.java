package Tools;

import java.util.Scanner;

public class QuanLy {
    private String maQL;
    private String hoTen;
    public  QuanLy(){};

    public QuanLy(String maQL, String hoTen) {
        this.maQL = maQL;
        this.hoTen = hoTen;
    }

    public String getMaQL() {
        return maQL;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã quản lý: ");
        maQL = sc.nextLine();
        System.out.print("Nhập họ tên quản lý: ");
        hoTen = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Mã quản lý: " + maQL);
        System.out.println("Họ tên quản lý: " + hoTen);
    }
}
