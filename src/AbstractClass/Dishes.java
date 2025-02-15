package AbstractClass;

abstract class Dishes {
    //An abstract class is a class that is declared abstract
    //it may or may not include abstract methods
    //Abstract classes cannot be instantiated, but they can be subclassed
    //An abstract method is a method that is declared without an implementation
    //Abstract classes may have abstract methods
    //abstract methods are declared with the abstract keyword and end with a semicolon
    //they are instantiated in the subclass
    abstract void whatMeal();
    void clean(){
        System.out.println("Cleaning dishes");
    }
}
