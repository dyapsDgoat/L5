/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_L5_N1;

/**
 *
 * @author japsy
 */
public class Person {
    String name;
    int age;
    int id;
    
    @Override
    public String toString(){
        return "Name: " + name + " Age: " + age + " ID: " + id;
    } 
  
    public static void main (String[]args){
    Person person1 = new Person();
    person1.name = "James Gabriel Pogi";
    person1.age = 48;
    person1.id = 32133;
    
    System.out.println(person1);
    }
}
