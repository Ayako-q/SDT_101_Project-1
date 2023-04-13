package Part3_ArrayList;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args)
    {
        System.out.println("\n\u001B[35mPart 3.1\n\u001B[0m");
        // Creating arraylists for String and Integer types
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Integer> integerList = new ArrayList<>();

        // 3.1.2 Use of add(value)
        // For strings
        stringList.add("American");
        stringList.add("University");
        stringList.add("Kyiv");

        //For integers
        integerList.add(2015);
        integerList.add(2022);
        integerList.add(2024);
        integerList.add(2025);

        // 3.1.3 method add(index, value)
        stringList.add(0, "AUG");
        stringList.add(2, "3096");
        integerList.add(1,2023);

        // 3.1.4 get() and enhanced for loop
        int i = 0;
        for (String element : stringList)
        {
            System.out.println("My stringList element of index " + i + ": " + stringList.get(i));
            i++;
        }

        // 3.1.5 set()
        stringList.set(0, "AUK");
        System.out.println("Element 0 changed to: " + stringList.get(0) + " by using set() method\n");

        // 3.1.6 remove()
        // regular for loop
        for(int c = 0; c < integerList.size(); c++)
        {
            System.out.println("Element of an integerList " + c + " " + integerList.get(c) + "\n");
        }
        integerList.remove(0);
        stringList.remove(2);

        // 3.1.7 addAll() 3.1.8 indexOf() and 3.1.9 remove()
        String[] names = {"Alice", "Bob", "Chris", "David", "Emily", "Frank", "Gina", "Harry", "Isabel", "Olena", "Peter"};
        ArrayList<String> namesList = new ArrayList<>();
        namesList.addAll(List.of(names));
        int inof = namesList.indexOf("Olena");
        namesList.remove(inof);
        for (String element : namesList)
        {
            System.out.println("My stringList" + element);
        }

        // and now we iterate through our ArrayLists with for loops to see all the results
        for(int c = 0; c < integerList.size(); c++)
        {
            System.out.println("My integerList " + c + " " + integerList.get(c));
        }
        i = 0;
        for (String element : stringList)
        {
            System.out.println("My stringList " + i + ": " + element);
            i++;
        }

        // Part 3.2
        System.out.println("\n\u001B[35mPart 3.2\n\u001B[0m");
        insertName(namesList,"Oleg");
    }

    public static void insertName(ArrayList<String> list, String name)
    {
        int index = 0;
        while (index < list.size() && list.get(index).compareTo(name) < 0) {
            index++;
        }
        list.add(index, name);
        System.out.println("\n\u001B[32mYour name is successfully added\n\u001B[0m");
        for (String element : list)
        {
            System.out.println(element);
        }
    }
}
