/*
3. Declare the SportCar class, which describes a sport car. The class should extend Car, another class. 
You should declare, in each one of these classes, at least 2 attributes, at least 2 methods and the toString() method. 
You should check these classes by instantiating them and checking their toString() method by sending their references to the println method. 
Each one of the attributes should be private. 
 */
package OOP_L5_N3;

//  James Gabriel H. Japson BSIT-2A
public class Main {
    public static void main (String []args){
        System.out.println("---------------------- REGULAR CAR-------------------");
        Car car1 = new Car("Tesla", "X", 500);
        System.out.println(car1);
        car1.averageSpeedOfRegularCar();
        car1.uses();
        
        System.out.println("---------------------- SPORT CAR-------------------");
        SportCar sportCar1 = new SportCar("Buggati", "Veyron", 987, 2.5,431.075);
        System.out.println(sportCar1);
        sportCar1.isSlowestCar();
        sportCar1.reach60MPH();
    }
}
