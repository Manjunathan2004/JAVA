package day3;

class Students{
    String name;
    int rno;
    String dept;
    static String college;

    public Students(String name,int rno,String dept,String college){
        this.name=name;
        this.rno=rno;
        this.dept=dept;
        this.college=college;
    }
    //    No-args Constructor
    public Students(){

    }
    public void display(){
        System.out.println("Name: "+name+"\nRno: "+rno+"\nDept: "+dept+"\nCollege Name: "+college);
    }
}
public class ConstructorDemo {
    public static void main(String[] args) {
        Students.college="MSAJCE";
        Students s1=new Students("Manjunathan",18,"IT","MSAJCE");
        s1.display();
        System.out.println("--------------------------------------");
        Students s2=new Students();
        s2.name="Mohan";
        s2.rno=21;
        s2.dept="Civil";
        s2.display();
        System.out.println("--------------------------------------");
        Students s3=new Students();
        s3.name="Kathirvel";
        s3.rno=13;
        s3.dept="AIDS";
        s3.display();
        System.out.println("--------------------------------------");
        Students s4=new Students();
        s4.name="Kumar";
        s4.rno=53;
        s4.dept="CSE";
        s4.display();
        System.out.println("--------------------------------------");


    }
}
