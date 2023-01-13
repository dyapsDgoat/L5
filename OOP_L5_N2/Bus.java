/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_L5_N2;

/**
 *
 * @author japsy
 */
public class Bus extends Car {
    final double averageSeatCapacity = 50;
    int seatCapacity;
    int widthOfSeats;
    int lengthOfSeats;
    
   Bus(String brand, int horsePower, String transmission, String drivetrain, int seatCapacity, int widthOfSeats, int lengthOfSeats){
       super(brand, horsePower, transmission, drivetrain);
       this.seatCapacity = seatCapacity;
       this.widthOfSeats = widthOfSeats;
       this.lengthOfSeats = lengthOfSeats;
   }
   
   public void averageSeatCapacity(){
       
       if (seatCapacity > averageSeatCapacity)
           System.out.println(brand + " can accomodate more people than an average bus " );
       else
           System.out.println("The average bus can accomodate 50 people (excluding the driver)" );
   }
   
   @Override
   public String toString(){
       return super.toString() + " Seat Capacity: " + seatCapacity + " Width of Seats: " + widthOfSeats + " Length of Seats: " + lengthOfSeats;
   }
}
