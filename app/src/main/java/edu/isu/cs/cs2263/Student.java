package edu.isu.cs.cs2263;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Course> enrolledCourses = new ArrayList<Course>();

    public Student(){}

    public Student(String first, String last){
        setFirstName(first);
        setLastName(last);
    }

    public void setFirstName(String name){
        firstName = name;
    }
    public void setLastName(String name){
        lastName = name;
    }
    public void setCourse(Course newCourse) {enrolledCourses.add(newCourse); }

    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public ArrayList<Course> getCourses(){return enrolledCourses;}

    public String toString(){
        return getFirstName() + " " + getLastName();
    }
}
