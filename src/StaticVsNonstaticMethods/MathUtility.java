package StaticVsNonstaticMethods;

public class MathUtility {
    // Static method - belongs to the class itself
    public static int square(int number) {
        return number * number;
    }

    // Non-static method - belongs to an instance of the class
    public int add(int a, int b) {
        return a + b;
    }
}