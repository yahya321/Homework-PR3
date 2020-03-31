/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.pr3;

/**
 *
 * @author yahya
 */
public class Student {
    private int id;
    private String Name;
    private String Major;
    private double Grade;

    public Student(int id, String Name, String Major, double Grade) {
        this.id = id;
        this.Name = Name;
        this.Major = Major;
        this.Grade = Grade;
    }
    
    

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }

    public void setGrade(double Grade) {
        this.Grade = Grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getMajor() {
        return Major;
    }

    public double getGrade() {
        return Grade;
    }
    
}
