package Tools;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String name;
    private String clas;
    private Double score;
    private Faculty faculty;
    public static ArrayList<Student> students=new ArrayList<>();
    public Student(){}

    public Student(String name, String clas, Double score, Faculty faculty) {
        this.name = name;
        this.clas = clas;
        this.score = score;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
    public  void input(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập tên sinh viên: ");
        name=sc.nextLine();
        System.out.println("Nhập lớp: ");
        clas=sc.nextLine();
        System.out.println("Nhập điểm: ");
        score=sc.nextDouble();
        sc.nextLine();
        faculty=new Faculty();
        faculty.input();

    }
    public void output(){
        System.out.println("Tên sinh viên: "+ name);
        System.out.println("Lớp: "+ clas);
        System.out.println("Điểm: "+ score);
        faculty.output();
    }

}
