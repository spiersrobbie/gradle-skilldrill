package edu.isu.cs.cs2263;

public class Course {
    private int number;
    private String subject;
    private String title;

    public Course(){}

    public Course(int num, String subj, String title){
        setNumber(num);
        setSubject(subj);
        setTitle(title);
    }

    public void setNumber(int num){number = num;}
    public void setSubject(String subj){subject = subj;}
    public void setTitle(String title){this.title = title;}

    public int getNumber(){return number;}
    public String getSubject(){return subject;}
    public String getTitle(){return title;}

    public String toString(){
        return getSubject() + " " + getNumber() + ": " + getTitle();
    }

}
