/*
2. Declare the Bus class to describe a bus. Declare the Car class to describe a car. The Bus class should extend the Car class. 
Think about the different variables and methods (constructors as well) that should be declared in each one of the classes.  
Test the classes that you declared using a stand-alone application (another separate class).  
 */
package OOP_L5_N2;

//  James Gabriel H. Japson BSIT-2A
public class Main {
    public static void main(String[] args){
    Car car1 = new Car("Hyundai", 1000, "Automatic", "front-wheel drive");
    Bus bus1 = new Bus("VictoryLiner", 250, "Manual", "Rear-wheel drive", 50, 21, 23);
    
    System.out.println("----------------------CAR-------------------");
    System.out.println(car1);
    car1.size();
    Car.howFast();
    
    System.out.println("----------------------BUS-------------------");
    System.out.println(bus1);
    bus1.averageSeatCapacity();
    
    }
}
