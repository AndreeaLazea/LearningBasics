package StaticVsNonstaticMethods;

public class main {
    public static void main(String[] args){
        //STATIC METHODS are part of the class itself
        //not of an instance of the class
        //whereas NON STATIC METHODS are part of the
        //instance of the class
        MathUtility mathUtility = new MathUtility();

        System.out.println(mathUtility.add(1, 2));

        System.out.println(MathUtility.square(2));

        //System.out.println(MathUtility.add(1, 2)); //ERROR
        //System.out.println(mathUtility.square(2)); //ERROR
    }
}
