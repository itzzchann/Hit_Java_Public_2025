import java.util.Scanner;

public class B2 {
    public static String daoChuoi(String s) {
        String s2 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s2 += s.charAt(i);
        }
        return s2;
    }

    public static void chuoiDoiXung(String s) {
        if (s.equals(daoChuoi(s))) {
            System.out.println("In hoa chuoi: " + s.toUpperCase());
            System.out.println("Chuoi nay doi xung!!!");
        } else {
            System.out.println("In thuong chuoi: " + s.toLowerCase());
            System.out.println("Chuoi nay KHONG doi xung!!!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();

        chuoiDoiXung(s);
    }
}

