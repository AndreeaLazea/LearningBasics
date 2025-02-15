package Interface;

public class main {
    public static void main(String[] args){
        //You cannot create an instance of an interface
        //InterfaceClass interfaceClass = new InterfaceClass(); //ERROR
        InterfaceSubclass interfaceSubclass = new InterfaceSubclass();
        interfaceSubclass.interfaceMethod();

        //Same with abstract. You can't create an instance of an abstract class
        //AbstractClass abstractClass = new AbstractClass(); //ERROR
        AbstractSubclass abstractSubclass = new AbstractSubclass();


        //difference between interface and abstract => abstract can have concrete methods.



        //A SUBCLASS CAN HAVE MULTIPLE INTERFACES => MULTIPLE INHERITANCE
    }
}
