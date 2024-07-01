/*
1)Encapsulation
2)Inheritance
3)PolyMorphism
4)Abstraction

*)Constructors=>    NON PARAMETERIZED
                    PARAMETERIZED
                    COPY CONSTRUCTORS =>DEEP COPY and SHALLOW COPY
*)Destructors

1)ENCAPSULATION : The process by which data(variables) and
the code that act upon them(Methods) are Integrated as a single unit.

2)INHERITANCE :  The pillar in oops in which Properties and Methods of
    BASE class are passed on to a Deriver Class.
    
    TYPES   :   1)Single level
                2)Multi level
                3)Hierarchial
                4)Hybrid
                5)Multiple

*/
public class S3OOPSPILLERS {
    public static void main(String[] args) {

    }
}

class Animal {
    String name;
    int age;
}

class bird extends Animal {
    String type;
    String species;

    void setname() {
        this.name = "bird";
    }

    void settype() {
        this.type = "bird";
    }
}
