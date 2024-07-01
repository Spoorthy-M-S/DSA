/*
Interfaces are bluePrint of class=>Class are blue print of objects 
class extends class
interface extends interface
class implements interface

Mainly Used :
To help Multiple Inheritance.
To achieve abstraction.

 * 1)Interface helps in Complete/Total Abstractions.
 * 2)All Methods are Public , Abstract , Without Implementation.
 * 3)Variables in the interface are Final,Public,and Static.
 */
public class S5Interface {

    public static void main(String[] args) {

    }

}

interface Animal {
    void eats();

    void walks();
}

class bird implements Animal {
    public void eats() {
        System.out.println("EATS GRAINS");
    }

    public void walks() {
        System.out.println("CAN WALK ALSO FLY");
    }
}

class fish implements Animal {
    public void eats() {
        System.out.println("EATS NON_VEG");
    }

    public void walks() {
        System.out.println("CANNOT WALK ONLY SWIM");
    }
}