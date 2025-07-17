import java.util.Scanner;

public class Bt1 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap Ten : ");
        String ten =sc.nextLine();
        System.out.println("Nhap Tuoi : ");
        int tuoi = sc.nextInt();
        System.out.println("Nhap Chieu Cao : ");
        float cao = sc.nextFloat();
        System.out.println("Xin chao "+ ten+", bạn "+tuoi+" tuoi va cao "+cao+" met ");
    }
}
