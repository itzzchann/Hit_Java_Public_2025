package Tool;
import java.time.Year;

public class Student {
    private String name;
    private int year;
    private String add;
    private double tx1;
    private double tx2;
    private double kthp;
    private int misclas;
    public Student(String name,int year,String add,double tx1,double tx2,double kthp,int misclas){
        this.name=name;
        this.year=year;
        this.add=add;
        this.tx1=tx1;
        this.tx2=tx2;
        this.kthp=kthp;
        this.misclas=misclas;
    }
    public String getName(){
        return name;
    }public  String getAdd(){
        return add;
    }
    public int getYear(){
        return  year;
    }
    public double getTx1(){
        return tx1;
    }public double getTx2(){
        return tx2;
    }public double getKthp(){
        return kthp;
    }public int getMisclas(){
        return misclas;
    }public void setName(String name){
        this.name=name;
    }public void setYear(int year){
        this.year=year;
    }
    public void setAdd(String add) {
        this.add = add;
    }
    public void setTx1(double tx1) {
        this.tx1 = tx1;
    }
    public void setTx2(double tx2) {
        this.tx2 = tx2;
    }
    public void setKthp(double kthp) {
        this.kthp = kthp;
    }
    public void setMisclas(int misclas) {
        this.misclas = misclas;
    }
    public int getBirthday(){
        return Year.now().getValue()-year;
    }
    public double getGpa(){
        return tx1*0.2+tx2*0.3+kthp*0.5;
    }
}
