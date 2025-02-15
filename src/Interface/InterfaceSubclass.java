package Interface;

public class InterfaceSubclass implements InterfaceClass, Interface2{
    //INTERFACES = are not extended, but implemented.
    //you need to IMPLEMENT the functions here
    //the functions need to be public
    //you can't have a private function in an interface
    public void interfaceMethod(){
        System.out.println("Interface method in interface subclass. Here it's implemented");
    }
    public void anotherInterfaceMethod(){
        System.out.println("Another interface method in interface subclass. Here it's implemented");
    }

    public void interfaceMethod2(){
        System.out.println("Interface method 2 in interface subclass. Here it's implemented");
    }
    public void anotherInterfaceMethod2(){
        System.out.println("Another interface method 2 in interface subclass. Here it's implemented");
    }

}
