import java.util.*;
public class LearnDataTypes {
    public static void main(String[] args){
        //1. Primitive data types: bool, char, int, short,
        // byte, long, float, double
        //creating and initializing a character
        char a = 'g';

        //integer data type is usually
        //used for numeric values
        int i = 89;


        //use byte and short
        //if memory is constraint
        byte b = 4;
        short s = 56;

        //this will give error as number is
        //larger than  yte range
        //bye b1 = 78888888895;


        //by default fraction value
        //is double in java
        double d = 4.56676544;

        //for float use 'f' as suffix as standard
        float f = 4.56677f;

        //need to hold big range of numbers when we ned
        //this data type
        long l = 12121212;

        System.out.println("char: " + a);
        System.out.println("integer: " + i);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("double: " + d);
        System.out.println("float: " + f);
        System.out.println("long: " + l);


        //2. Non-primitive data types: String, Array, List
        // 2.1 ARRAY
        // = must hold the same data type
        // = fixed size decalred at creation
        // = faster than list at acess O(1)

        int[] array = new int[7];

        //add elements to the array
        array[0] = 33;



        //2.2 LIST
        // = can have different data types, in python for ex
        // = dynamic size, can grow or shrink
        //slower solution access, O(n)
        //needs java.util.ArrayList import.
        ArrayList<Integer> list = new ArrayList<>();

        //add elements to the list
        list.add(3);

        //delete element in a list
        list.removeLast();
        //or remove using the index
        list.add(3);
        list.remove(0);  //remove the first element

        //print the list
        System.out.println(list);

        //2.3 STRING
        String str = "lalalalla";

        //GET CHARACTER AT POSITION IN STRING.
       // System.out.println(str[0]); NOT WORKING

        char ch = str.charAt(0);
        System.out.println(ch);

        //You can turn a string to an array of characters
        char[] chs = str.toCharArray();
        for( char ce: chs){
            System.out.println(ce + " ");
        }
    }
}
