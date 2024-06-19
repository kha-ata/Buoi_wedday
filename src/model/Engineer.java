/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class Engineer extends Person{
    private String about;
    public Engineer(String name, String job, int age,String about) {
        super(name, job, age);
        this.about=about;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Override
    public void level() {
        System.out.println("co 5 level tu A den E(A B C D E)");
    }
    @Override
    public String toString() {
        return job + ": name:"+name+", age:"+age +", about:" +about;
    }
    
}
