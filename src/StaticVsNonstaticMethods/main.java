package StaticVsNonstaticMethods;

public class main {
    public static void main(String[] args) {
        // Instance of MathUtility for calling non-static method
        MathUtility mathUtility = new MathUtility();

        // Calling non-static method using an instance of MathUtility
        System.out.println(mathUtility.add(1, 2)); // Outputs 3

        // Calling static method using the class name
        System.out.println(MathUtility.square(2)); // Outputs 4

        // Incorrect usage examples (commented out because they will cause errors)
        // This line would cause an error because add is a non-static method
        // System.out.println(MathUtility.add(1, 2));

        // It's possible to call a static method on an instance, but it is not recommended
        // This line will work but it's bad practice:
        // System.out.println(mathUtility.square(2));
    }
}