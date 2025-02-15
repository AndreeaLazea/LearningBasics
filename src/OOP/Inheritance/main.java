package OOP.Inheritance;

public class main {
    public static void man(String[] args){
        //Inheritance =  allows a class to inherit properties
        // from another class. it has Base Class(ex: Animal)
        // and Derived Class(ex: Cat)
        Animal animal = new Animal("Dog", 4, 43.5f, "this variable wont send");
        Cat cat = new Cat("Cat", 4, 5, 12);
        System.out.println(animal.name);
        System.out.println(cat.name);
        System.out.println(cat.whiskers);

        //A CLASS CAN HAVE MULTIPLE INHERITANCE BY HAVING MULTIPLE INTERFACES.
        //ex: see Interface package.

    }
}
