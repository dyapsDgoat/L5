/*
1. Declare the Person class that describes a human and the Student class that extends Person. 
The attributes in each instance of type Person should include: name, age and id. 
The attributes in each instance of type Student should include, in addition to those that inherited from class Person, the attribute average. 
Each of the two classes should have declared the toString() method. 
You should check these two classes by instantiating them and invoking the toString method on each one of them.
Don’t declare any constructors in the classes Person and Student. 
 */
package OOP_L5_N1;

//  James Gabriel H. Japson BSIT-2A
public class Main {
       public static void main (String[] args){
        System.out.println("----------------------PERSON-------------------");
        Person person1 = new Person();
        person1.name = "James Pogi";
        person1.age = 20;
        person1.id = 32133;
        System.out.println(person1);
        
        
        System.out.println("----------------------STUDENT-------------------");
        Student student1 = new Student();
        student1.name = "Kevin Durant";
        student1.age = 17;
        student1.id = 12345;
        student1.average = 89.90;
        
        System.out.println(student1);
    }
}
