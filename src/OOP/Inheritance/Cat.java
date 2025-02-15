package OOP.Inheritance;

public class Cat extends Animal{
    public int whiskers;
    public Cat(String name, int legs, float kg, int whiskers){
       // super(name, legs, kg);
        //super(name, legs, kg); wont work bc cant send private to derivate classes
        //so it calls the constructor with no parameters from Animal for this.
        this.name = name;
        this.whiskers = whiskers;
        this.legs = legs;
        this.kg = kg;
    }
}
