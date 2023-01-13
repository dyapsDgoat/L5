/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_L5_N1;

/**
 *
 * @author japsy
 */
public class Student extends Person {
    double average;
    
    @Override
    public String toString(){
        return super.toString() + " Average: " + average;
    }
    
    public static void main(String[] args){
    Student student1 = new Student();
    student1.name = "Reddragon kineme";
    student1.age = 19;
    student1.id = 321133;
    student1.average = 90.78;
    
    System.out.println(student1);
    }
}
