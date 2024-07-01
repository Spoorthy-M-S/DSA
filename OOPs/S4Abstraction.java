public class S4Abstraction {

    public static void main(String[] args) {
        
    }
    
}
abstract class Animal{
    String name;
    String number;

    abstract String getname();
    
    void setNumber(String number){
        this.number=number;
    }
    String getnumber(){
        return this.number;
    }
}
class bird extends Animal{
        String getname(){
            return this.name;
        }
}
/*
 * No 100% abstraction 
 * so we use INTERFACE for 100% abstraction
 */
