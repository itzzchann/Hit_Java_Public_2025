import java.util.Scanner;

public class B1 {

    static final String SQUARE = "Square";
    static final String TRIANGLE = "Triangle";
    static final String CIRCLE = "Circle";
    static final double PI = 3.14;

    public static double Sv(double canh) {
        return canh * canh;
    }

    public static double Sta(double chieuCao, double day) {
        return (chieuCao * day) / 2;
    }

    public static double Str(double banKinh) {
        return PI * banKinh * banKinh;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập hình dạng viên gạch (Square/Triangle/Circle): ");
        String type = sc.nextLine();
        if (type.equalsIgnoreCase(SQUARE)) {
            System.out.print("Nhập độ dài cạnh hình vuông: ");
            double canh = sc.nextDouble();
            System.out.println("Diện tích hình vuông là: " + Sv(canh) + " cm²");
        } else if (type.equalsIgnoreCase(TRIANGLE)) {
            System.out.print("Nhập chiều cao của tam giác: ");
            double cc = sc.nextDouble();
            System.out.print("Nhập cạnh đáy của tam giác: ");
            double cd = sc.nextDouble();
            System.out.println("Diện tích tam giác là: " + Sta(cc, cd) + " cm²");
        } else if (type.equalsIgnoreCase(CIRCLE)) {
            System.out.print("Nhập bán kính hình tròn: ");
            double r = sc.nextDouble();
            System.out.println("Diện tích hình tròn là: " + Str(r) + " cm²");
        } else {
            System.out.println("Hình dạng không hợp lệ!");
        }

        sc.close();
    }
}
