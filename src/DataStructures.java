import java.util.ArrayList;
import java.util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
public class DataStructures {
    public static void ArrayVsList(){
        //1. ARRAY
        //=Must hold the same data types
        //fixed size declared at creation

        int[] array = new int[5];
        array[0] = 5;
        array[1] = 45;
        //print array
        for(int num : array){
            System.out.println(num);
        }

        String[] stringArray = new String[5];
        stringArray[0] = "hello";
        stringArray[1] = "world";

        for(String str: stringArray){
            System.out.println(str);
        }


        //delete element from array INT
        //array.remove(0); //NOT WORKING
        //array.removeLast(); //NOT WORKING
        //copy the elements minus the one you don't want in a new array
        int[] newArray = new int[array.length - 1];
        int j = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] != 5)
            {
                newArray[j] = array[i];
                j++;

            }
        }
        j--;
        for(int num: newArray){
            System.out.println(num);
        }

        //DELETE ELEMENT FROM ARRAY STRING

        String stringTarget = "world";
         j = 0;
        String[] newArrayString = new String[ stringArray.length - 1];
        for(int i = 0; i < stringArray.length; i++)
        {
         if(!(Objects.equals(stringArray[i], stringTarget)))
         {
             newArrayString[j] = stringArray[i];
             j++;
         }
        }
        j--;
        for(String strr: newArrayString)
        {
            System.out.println(strr);
        }


        //2.LIST
        //= can have different data types, in python
        // dynamic size, can grow or shrink

        //needs java.util.ArrayList import
        ArrayList<Integer> listInt = new ArrayList<>();
        ArrayList<String> listString = new ArrayList<>();
        listInt.add(7);
        listInt.add(78);
        listInt.add(780);

        listString.add("aaaaa");
        listString.add("bbbb");

        //print the int list
        System.out.println(listInt);

        //print the string list
        System.out.println(listString);


        //delete elements from a int list, works for string one aswell

        listInt.remove(0);//remove using position;
        System.out.println(listInt);
        //FUN FACT. if we have for example [10, 20, 30, 1, 2]
        //and we write listInt.remove(0); it removes 20,
        //we can write listInt.remove(0) again and this time it removes 30.


        //IF WE WANT TO REMOVE USING THE VALUE

        listInt.remove(Integer.valueOf(78)); //remove using value
        System.out.println(listInt);

    }
    public static void MapVsList(){
        //MAP
        // = holds key-value points
        // = keys are unique

        //needs java.util.HashMap import
        HashMap<String, Integer> map = new HashMap();
        //add elements to map

        map.put("Alice", 20);
        map.put("Andreea", 22);
        System.out.println(map);

        //look for value based on key
        int value = map.get("Alice");
        System.out.println(value);

        //delete element from a hashmap based on key
        map.remove("Alice");
        System.out.println(map);

        //LIST
        // = indexed list of elements
        // = can have duplicates
        //needs ArrayList imported from java.util.ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Alice");
        list.add("Alice");
    }
    public static void SetVsList(){
        //LIST
        // = allows duplicates
        //can have multiple null values
        //ordered, indexed
        //needs ArrayLidt imported from java.util.ArrayList

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);

        //SET
        // = only unique elements
        //can have only one null value
        //unordered, except TreeSet and linkedHashSet
        //a set is unordered because {1, 2, 3} and {2, 3, 1} and { 3, 2, 1} are the same set
        //needs java.util.HashSet import
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(10); // will be ignored because only one value can have 10.
        set.add(78);
        for(int num: set){
            System.out.println(num);
        }

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(78);
        set2.add(10);
        for(int num : set2){
            System.out.println(num);
        }

        boolean bool = set.equals(set2);
        System.out.println("are set 1 and set 2 the same?" );
        if(bool == true){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }


    }
    public static void LinkedListVsArrayList(){
        //LINKED LIST
        // = faster insertion/ deletion
        // = needs import java.util.LinkedList

        //ARRAY LIST
        // = faster get
        // = needs import java.util.ArrayList

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(12);
        System.out.println(linkedList);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList);

    }

    public static void main(String[] args){
        ArrayVsList();
        MapVsList();
        SetVsList();
        LinkedListVsArrayList();
    }
}
