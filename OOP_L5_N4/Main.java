
/*  
4. Declare the Student , bus , sports car classes as classes that implement the Printable interface and run the application. 
The output of this application should be the details of each one of the objects that were instantiated.
*/

package OOP_L5_N4;

interface Printable{
    void print();
}

public class Main {
    public static void main (String[] args){
        Bus bus1 = new Bus();
        SportCar sportCar1 = new SportCar();
        Student student1 = new Student();
        
        bus1.print();
        sportCar1.print();
        student1.print();
    }
}
