class A1ClassAndObjects {
    public static void main(String[] args) {
        Animal a1 = new Animal(); // Objects==Instance of class that represents a real-world entity
        a1.setName("Zeebra");

    }
}

class Animal { // Class=Bulueprint of objects OR
               // templete that determines the structure
               // and behavior of Object=Contains Attribute(Properties)+function(behavour)
    String animalName;
    String breed;
    int number;

    void setName(String name) { // Setters
        this.animalName = name;
    }

    String getName() { // getters
        return this.animalName;
    }
}
/*
 * Class=Bulueprint of objects OR
 * templete that determines the structure
 * and behavior of Object=Contains Attribute(Properties)+function(behavour)
 *
 * Objects==Instance of class that represents a real-world entity
 *
 * The object when created (CONSTRUCTOR CREATED)it take the memory in heap(HEAP
 * MEMORY).
 */