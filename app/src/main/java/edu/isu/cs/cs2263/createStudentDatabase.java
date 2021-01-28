package edu.isu.cs.cs2263;

import java.util.ArrayList;
import java.util.List;

public class createStudentDatabase {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Course> allCourses = new ArrayList<>();

        allCourses.add(new Course(2263, "CS", "Advanced OOP"));
        allCourses.add(new Course(1112, "PHYS", "Physics 1"));
        allCourses.add(new Course(3313, "PHYS", "Intermediate Lab"));
        allCourses.add(new Course(4403, "PHYS", "Advanced Modern Physics"));
        allCourses.add(new Course(1337, "CS", "Systems eng. and Programming"));
        allCourses.add(new Course(1181, "CS", "Intro to CS"));
        allCourses.add(new Course(1170, "MATH", "Calc 1"));
        allCourses.add(new Course(1175, "MATH", "Calc 2"));

        Student stud1 = new Student("Robbie", "Spiers");
        stud1.setCourse(allCourses.get(3));
        stud1.setCourse(allCourses.get(7));
        stud1.setCourse(allCourses.get(1));
        stud1.setCourse(allCourses.get(5));

        Student stud2 = new Student("Danny", "Phantom");
        stud2.setCourse(allCourses.get(2));
        stud2.setCourse(allCourses.get(3));
        stud2.setCourse(allCourses.get(4));
        stud2.setCourse(allCourses.get(5));

        Student stud3 = new Student("Firelord", "Zuko");
        stud3.setCourse(allCourses.get(7));
        stud3.setCourse(allCourses.get(0));
        stud3.setCourse(allCourses.get(3));
        stud3.setCourse(allCourses.get(1));

        Student stud4 = new Student("Alex", "Claremont-Diaz");
        stud4.setCourse(allCourses.get(6));
        stud4.setCourse(allCourses.get(3));
        stud4.setCourse(allCourses.get(0));
        stud4.setCourse(allCourses.get(5));

        students.add(stud1);
        students.add(stud2);
        students.add(stud3);
        students.add(stud4);

        IOManager.writeData("CourseRegistration", students);

        System.out.println(IOManager.readData("CourseRegistration"));

        List<Student> studNew = IOManager.readData("CourseRegistration");
        Student stud00 = studNew.get(0);
        System.out.println(stud00.getCourses());

    }
}
