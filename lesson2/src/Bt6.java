import java.util.Scanner;

class Sv{
    String name;
    int age;
    double gpa;
}

public class Bt6 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println(" Nhap so sinh vien: ");
        int n= sc.nextInt();
        Sv  [] a=new Sv[n];
        Double dtb=0.0;
        Double max=-1.0;
        int vt=0;
        sc.nextLine();
        for(int i=0;i<n;i++){
            a[i] = new Sv();
            System.out.println(i);


            System.out.print("Ten: ");
            a[i].name = sc.nextLine();

            System.out.print("Tuoi: ");
            a[i].age = sc.nextInt();

            System.out.print("GPA: ");
            a[i].gpa = sc.nextDouble();
            sc.nextLine();
            dtb+=a[i].gpa;

                if(a[i].gpa > max) {
                    max = a[i].gpa;
                    vt= i;
                }


        }System.out.println("Danh sach sinh vien: ");
        for(int i=0;i<n;i++){
            System.out.println("Ten: "+a[i].name+" - Tuoi: "+a[i].age+" - GPA: "+a[i].gpa);
        }
        System.out.println("Diem tb: "+ (dtb*1.0/n));
        System.out.println("GPA cao nhat: ");
        System.out.println("Ten: "+a[vt].name+" - Tuoi: "+a[vt].age+" - GPA: "+a[vt].gpa);
    }

}
