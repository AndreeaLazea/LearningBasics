package OOP.Polymorphism;

public class main {
    public static void main(String[] args){
        //Polymorphism = the ability of different objects to
        //interact with the same method in different ways
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.makeSound();
        dog.makeSound();
    }
}
