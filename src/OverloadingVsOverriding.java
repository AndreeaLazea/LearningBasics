public class OverloadingVsOverriding {
    //OVERLOADING
    // = when two or more methods in the same class have the same name but DIFFERENT signatures.
    public void method1(int x){
        System.out.println(x);
    }
    public void method1(String s){
        System.out.println(s);
    }

    //OVERRIDING
    // = redifining a method in a subclass that was originally defined in the supperclass
    //This is also polymorphism.
    //ex: see OOP/Polymorphism/Animal.java and OOP/Polymorphism/Dog.java
}
