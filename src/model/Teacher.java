/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class Teacher extends Person{
    private String major;
    public Teacher(String name, String job, int age,String major) {
        super(name, job, age);
        this.major=major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void level() {
        System.out.println("co 5 level:1-5");
    }
    @Override
    public String toString() {
        return job+ ": name:"+name+", age:"+age+", major:"+major;
    }
}
