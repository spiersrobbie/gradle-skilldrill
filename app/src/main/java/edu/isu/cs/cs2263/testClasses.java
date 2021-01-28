package edu.isu.cs.cs2263;
import java.util.ArrayList;
import java.util.List;

public class testClasses {
    public static void main(String[] args){
        Student myStudent = new Student("Robert", "Spiers");

        System.out.println(myStudent);

        Course myCourse = new Course(4463, "PHYS", "Mathematical Physics");

        System.out.println(myCourse);

        List<Student> multStudents = new ArrayList<>();
        multStudents.add(myStudent);
        multStudents.add(new Student("Jonathan", "Naes"));

        IOManager.writeData("CourseRegistration", multStudents);

        List<Student> newStudents = IOManager.readData("CourseRegistration");
        System.out.println(newStudents);
    }
}
