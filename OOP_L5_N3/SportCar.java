/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_L5_N3;

/**
 *
 * @author japsy
 */
public class SportCar extends Car {
    private double secsToAccelerateTo60;
    private double topSpeed;
    
    
    SportCar(String brand, String model, int horsePower, double secsToAccelerateTo60, double topSpeed){
    super(brand, model, horsePower);
    this.secsToAccelerateTo60 = secsToAccelerateTo60;
    this.topSpeed = topSpeed;
    }
    
    public void isSlowestCar(){
    if (topSpeed < 145)
        System.out.println("Your sport car is slower than the Skoda 110 R, the slowest sport car according to HOTCARS");
    else
        System.out.println("Your sport car is faster than the Skoda 110 R, the slowest sport car according to HOTCARS");
    }
    
    public void reach60MPH(){
        System.out.println("Your sport car can reach 60 mph in " + secsToAccelerateTo60 + " secs");
    }
        
    @Override
    public String toString(){
    return super.toString() + " Secs to accelerate to 60: " + secsToAccelerateTo60 + " Top Speed: " + topSpeed;
    
    }
    
    
    
    
    
    
    
    
}
