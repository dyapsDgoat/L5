/*
2. Declare the Bus class to describe a bus. Declare the Car class to describe a car. The Bus class should extend the Car class. 
Think about the different variables and methods (constructors as well) that should be declared in each one of the classes.  
Test the classes that you declared using a stand-alone application (another separate class).  
 */
package OOP_L5_N2;

/**
 *
 * @author japsy
 */
public class Car {
    String brand;
    int horsePower;
    String transmission;
    String drivetrain;  
    
    Car(String brand, int horsePower, String transmission, String drivetrain){
        this.brand = brand;
        this.horsePower = horsePower;
        this.transmission = transmission;
        this.drivetrain = drivetrain;
    }
    
    static void howFast(){
        System.out.println("Other cars are faster than a bus");
    }
    
    public void size(){
        System.out.println("Most common cars like SUVs, Hatchback, and Sedan are smaller than a bus");
    }
    
    @Override
    public String toString(){
        return "Brand: " + brand + " horse power: " + horsePower + " transmission: " + transmission + " drivetrain: " + drivetrain;
    }
}
