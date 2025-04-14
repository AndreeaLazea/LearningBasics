import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class DataStructures {

    public static void ArrayVsList() {
        // Arrays
        int[] array = new int[5];
        array[0] = 5;
        array[1] = 45;
        for (int num : array) {
            System.out.println(num);
        }

        String[] stringArray = new String[5];
        stringArray[0] = "hello";
        stringArray[1] = "world";
        for (String str : stringArray) {
            System.out.println(str);
        }

        // Simulate removing an element from an int array
        int[] newArray = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != 5) {
                newArray[j++] = array[i];
            }
        }
        for (int num : newArray) {
            System.out.println(num);
        }

        // Simulate removing an element from a String array
        String[] newArrayString = new String[stringArray.length - 1];
        for (int i = 0, j = 0; i < stringArray.length; i++) {
            if (!"world".equals(stringArray[i])) {
                newArrayString[j++] = stringArray[i];
            }
        }
        for (String str : newArrayString) {
            System.out.println(str);
        }

        // ArrayList
        ArrayList<Integer> listInt = new ArrayList<>();
        ArrayList<String> listString = new ArrayList<>();
        listInt.add(7);
        listInt.add(78);
        listInt.add(780);

        listString.add("aaaaa");
        listString.add("bbbb");

        System.out.println(listInt);
        System.out.println(listString);

        // Delete elements from an int list
        listInt.remove(0);
        System.out.println(listInt);

        listInt.remove(Integer.valueOf(78));
        System.out.println(listInt);
    }

    public static void MapVsList() {
        // HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 20);
        map.put("Andreea", 22);
        System.out.println(map);

        int value = map.get("Alice");
        System.out.println(value);

        map.remove("Alice");
        System.out.println(map);

        // ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Alice");
        list.add("Alice");
    }

    public static void SetVsList() {
        // ArrayList allows duplicates
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);

        // HashSet does not allow duplicates
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(78);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(78);
        set2.add(10);

        boolean bool = set.equals(set2);
        System.out.println("Are set 1 and set 2 the same? " + bool);
    }

    public static void LinkedListVsArrayList() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(12);
        System.out.println(linkedList);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList);
    }

    public static void main(String[] args) {
        ArrayVsList();
        MapVsList();
        SetVsList();
        LinkedListVsArrayList();
    }
}
