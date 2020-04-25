/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW_PR3_Ch4;

import java.util.Locale;

/**
 *
 * @author yahya
 */
public class Student {
    private Integer id;
    private String name;
    private  String major;
    private Double grade;

    public Student() {
    }

    public Student(Integer id, String name, String major, Double grade) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.grade = grade;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public Double getGrade() {
        return grade;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }
   @Override
   public String toString(){
       return String.format("%-5s %-10s %-10s %8.2f", id, name, major, grade);
   }
   
    
}
