package Assignments;

class Student {
    String name;
    int age;
    String email;
    String address;

    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name=name;
    }
    public int setage(){
        return age;
    }
    public void getage(int age){
        this.age=age;
    }
    public String getemail(){
        return email;
    }
    public void setemail(String email){
        this.email=email;
    }
    public String getaddress(){
        return address;
    }
    public void setaddress(String address){
        this.address=address;
    }
}
class Teacher{
    String name;
    int age;
    String email;
    String address;

    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name=name;
    }
    public int setage(){
        return age;
    }
    public void getage(int age){
        this.age=age;
    }
    public String getemail(){
        return email;
    }
    public void setemail(String email){
        this.email=email;
    }
    public String getaddress(){
        return address;
    }
    public void setaddress(String address){
        this.address=address;
    }
}
class Batch{
    String name;
    int size;
    Student[] students;
    Teacher teacher;

    Batch(String name, int size, Student[] students, Teacher teacher) {
        if(students.length < 3) {

            System.out.println("batch should contains minimum 3 students");  

        } else {
            this.name = name;
            this.size = size;
            this.students = students;
            this.teacher = teacher;
        }   
    }

    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name=name;
    }
    public int getsize(){
        return size;
    }
    public void setsize(int size){
        this.size=size;
    }
    public void setStudent(Student[] s){
        if(students.length < 3) {

            System.out.println("batch should contains minimum 3 students");
            
        } else {
            this.students=s;
        }    
    }
    public void setTeacher(Teacher t){
        this.teacher=t;
    }  
}
class Assignment3{

    public static void main(String[] args){
        Student s1= new Student();
        s1.name="Omprakash";
        s1.age=21;
        s1.email="omprakash123@gmail.com";
        s1.address="Hyderabad";
        System.out.println(s1.getname());
        System.out.println(s1.setage());
        System.out.println(s1.getemail());
        System.out.println(s1.getaddress());

        Student s2= new Student();
        s2.name="Shiva";
        s2.age=23;
        s2.email="shiva123@gmail.com";
        s2.address="Vizag";
        System.out.println(s2.getname());
        System.out.println(s2.setage());
        System.out.println(s2.getemail());
        System.out.println(s2.getaddress());

        Student s3= new Student();
        s3.name="priya";
        s3.age=21;
        s3.email="priya143@gmail.com";
        s3.address="Kurnool";
        System.out.println(s3.getname());
        System.out.println(s3.setage());
        System.out.println(s3.getemail());
        System.out.println(s3.getaddress());

        Teacher t1= new Teacher();
        t1.name="Abhi";
        t1.age=50;
        t1.email="abhi987@gmail.com";
        t1.address="Hyderabad";
        System.out.println(t1.getname());
        System.out.println(t1.setage());
        System.out.println(t1.getemail());
        System.out.println(t1.getaddress());

        Batch b1 = new Batch("batch1", 3, new Student[]{s1,s2,s3}, t1);
        System.out.println(b1.getname());

    }
}