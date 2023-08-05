package oop;

import java.util.ArrayList;

public class Mentor extends User{

    private ArrayList<Student> studentList=new ArrayList<>();

    public Mentor(Integer id,String name,String email,ArrayList<Student> studentList){
        super(id,name,email);
        this.studentList=studentList;
        System.out.println(id + name + email + studentList);
    }

}
