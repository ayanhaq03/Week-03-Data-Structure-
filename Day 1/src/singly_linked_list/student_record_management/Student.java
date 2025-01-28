package singly_linked_list.student_record_management;

public class Student {


    Student next ;
    int Rollno ;
    String name;
    int age;
    char grade;

    Student(int Rollno , String name , int age , char grade ){
        this.Rollno =Rollno;
        this.name = name;
        this.age = age;
        this.grade = grade;


    }

}
