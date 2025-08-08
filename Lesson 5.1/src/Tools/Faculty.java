package Tools;

import java.util.Scanner;

public class Faculty {
    private String name;
    private String date;
    private School school;

    public Faculty() {}
    public Faculty(String name, String date, School school) {
        this.name = name;
        this.date = date;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
    public  void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập tên khoa: ");
        name=sc.nextLine();
        System.out.println("Nhập ngày vào khoa: ");
        date=sc.nextLine();
        System.out.println("Nhập tên trường: ");
        String SchoolName= sc.nextLine();
        System.out.println("Nhập ngày vào trường: ");
        String SchoolDate= sc.nextLine();
        school= new School(SchoolName,SchoolDate);
    }
    public  void output(){
        System.out.println("Tên khoa: "+name);
        System.out.println("Ngày vào khoa: "+date);
        System.out.println("Tên trường: "+school.getName());
        System.out.println("Ngày vào trường: "+school.getDate());
    }
}
