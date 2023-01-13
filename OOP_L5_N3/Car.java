/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_L5_N3;

/**
 *
 * @author japsy
 */
public class Car {
    private String brand;
    private String model;
    private int horsePower;
    
    Car(String brand, String model, int horsePower){
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }
    
    public void averageSpeedOfRegularCar(){
    System.out.println("The average speed of a regular car is 193 km/h");
    }
    
    public void uses(){
    System.out.println("Regular cars are used cater to four or more passengers and ensuring their safety");
    }
    
    @Override
    public String toString(){
    return "Brand: " + brand + " Model: " + model + " Horse Power: " + horsePower;
    }
}
