package Oops;

class Student{
    String name;
    int age;
    
    Student(){

    }
    
    Student(Student s){
        this.name = s.name;
        this.age = s.age;
    }

    public void printInfo(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class Simple_Oops {
    public static void main(String args[]){
        Student s1=new Student();

        s1.name="Shankara";
        s1.age=27;
        //s1.printInfo();

        Student s2=new Student(s1);
        s2.printInfo();
    }
}
