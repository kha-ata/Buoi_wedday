/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public abstract class Student extends Person{
    private String mssv;
    public Student(String name, String job, int age,String mssv) {
        super(name, job, age);
        this.mssv=mssv;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    @Override
    public abstract void level() ;

    @Override
    public String toString() {
        return job + ": mssv=" + mssv + ", name:"+name+", age:"+age;
    }
    
}
