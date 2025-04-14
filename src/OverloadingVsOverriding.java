// Base class
class Animal {
    public void speak() {
        System.out.println("This animal speaks in a general way.");
    }
}

// Derived class that overrides the base class method
class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Bark!");
    }
}

public class OverloadingVsOverriding {
    // Method overloading examples
    public void print(int x) {
        System.out.println("Integer: " + x);
    }

    public void print(String s) {
        System.out.println("String: " + s);
    }

    public static void main(String[] args) {
        OverloadingVsOverriding test = new OverloadingVsOverriding();
        test.print(5);     // Calls the integer version
        test.print("Hello"); // Calls the string version

        // Method overriding demonstration
        Animal myAnimal = new Animal();
        myAnimal.speak();  // Output: This animal speaks in a general way.

        Dog myDog = new Dog();
        myDog.speak();     // Output: Bark!

        // Polymorphic call: overridden method is called on the object type, not reference type.
        Animal myPolymorphicDog = new Dog();
        myPolymorphicDog.speak(); // Output: Bark!
    }
}
