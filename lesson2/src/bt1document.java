import java.util.Scanner;

public class bt1document {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap ban kinh: ");
        Double r=sc.nextDouble();
        Double pi=3.14;
        System.out.println(" Chu vi hinh tron la: "+2*pi*r);
        System.out.println(" Dien tich hinh tron la: "+r*pi*r);
    }
}
