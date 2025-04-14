import java.util.ArrayList;

public class LearnDataTypes {
    public static void main(String[] args) {
        // Primitive data types: boolean, char, int, short, byte, long, float, double
        char a = 'g';
        int i = 89;
        byte b = 4;
        short s = 56;
        double d = 4.56676544;
        float f = 4.56677f;
        long l = 12121212L;

        System.out.println("char: " + a);
        System.out.println("integer: " + i);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("double: " + d);
        System.out.println("float: " + f);
        System.out.println("long: " + l);

        // Non-primitive data types: String, Array, ArrayList
        int[] array = new int[7];
        array[0] = 33;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        // There is no removeLast() in ArrayList; use remove with correct index
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
        }
        list.add(3);
        list.remove(0);  // remove the first element
        System.out.println(list);

        String str = "lalalalla";
        char ch = str.charAt(0);
        System.out.println(ch);

        char[] chs = str.toCharArray();
        for (char ce : chs) {
            System.out.println(ce + " ");
        }
    }
}
