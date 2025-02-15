package AbstractClass;

public class main {
    public static void main(String[] args){
        //You cannot create an instance of an abstract class
         //Dishes dish = new Dishes(); //ERROR
        Mug mug = new Mug();
        mug.whatMeal();
        mug.clean();
    }
}
