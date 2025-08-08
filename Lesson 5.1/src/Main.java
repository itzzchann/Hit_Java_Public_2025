import Tools.Student;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên: ");
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("\n=> Nhập thông tin sinh viên thứ "+(i+1)+":");
            Student s= new Student();
            s.input();
            Student.students.add(s);
        }
        System.out.println("\n===DANH SÁCH SINH VIÊN===");
        for(int i=0;i<n;i++){
            System.out.println("\nSinh viên "+(i+1)+":");
            Student.students.get(i).output();
        }
        }
    }
