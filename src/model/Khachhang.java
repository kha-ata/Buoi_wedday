/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.Scanner;

public  class Khachhang extends Person{
    
    public Khachhang(String ten, String tuoi, String gioitinh) {
        super(ten, tuoi, gioitinh);
    }
   
    

    @Override
    public void ngonNgu() {
        System.out.println("language:");
        Scanner sc= new Scanner(System.in);
        String NN=sc.nextLine();
        switch (NN) {
            case "VN":
                System.out.println("vietnam");
                break;
            case ""
            default:
                throw new AssertionError();
        }
        
    }
}
