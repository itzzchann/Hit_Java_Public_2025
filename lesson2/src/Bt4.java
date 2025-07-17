import java.util.Scanner;

public class Bt4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [] a=new int[5];
        int sumn=0;
        int maxn=-10000000;
        for(int i=0;i<5;i++){
            System.out.println("a["+i+"]: ");
            a[i]=sc.nextInt();
            sumn+=a[i];
            maxn=Math.max(a[i],maxn);
        }  System.out.println("Mang vua nhap la: ");
        for(int i=0;i<5;i++){

            System.out.println(a[i]+" ");
        }
        System.out.println("Gia tri lon nhat: "+maxn);
        System.out.println("Tong cac phan tu trong mang: "+sumn);

    }
}
