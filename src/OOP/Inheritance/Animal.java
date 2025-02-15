package OOP.Inheritance;

public class Animal {
    public String name;
    public int legs;
    public float kg;
    private String wontSend;
    public Animal(String name, int legs, float kg, String wontSend){
        this.name = name;
        this.legs = legs;
        this.kg = kg;
    }
    public Animal(){
        this.name = null;
        this.legs = 0;
        this.kg = 0;
        this.wontSend = null;
    }

    public void eat(){
        System.out.println("Animal eats");
    }
}
