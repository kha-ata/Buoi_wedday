/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlinhansu;

import model.Engineer;
import model.Person;
import model.Student;
import model.Teacher;
public class Quanlinhansu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Engineer en= new Engineer("minh", "Engineer", 23, "phan mem");
        Student st=new Student("thinh","Student", 15, "DE0617") {
            @Override
            public void level() {
                
            }
            
        };
        Teacher tch= new Teacher("khai", "Teacher", 30, "Funny code");
        System.out.println(tch.toString());
       System.out.println(en.toString());
    System.out.println(st.toString());
}
}
