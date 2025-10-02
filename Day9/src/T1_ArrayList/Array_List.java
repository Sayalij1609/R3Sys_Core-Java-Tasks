package T1_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Array_List {
  
	public static void main(String[] args) {
       
        ArrayList<String> studentNames = new ArrayList<>();

        
        studentNames.add("Rahul");
        studentNames.add("Priya");
        studentNames.add("Amit");
        studentNames.add("Sneha");
        studentNames.add("Vikram");
        
        System.out.println("Initial list: " + studentNames);

        
        studentNames.remove("Amit");
        System.out.println("After removing Amit: " + studentNames);

       
        Collections.sort(studentNames);
        System.out.println("Sorted list: " + studentNames);

        
        System.out.println("\nDisplaying list using for loop:");
        for (int i = 0; i < studentNames.size(); i++) {
            System.out.println(studentNames.get(i));
        }

        System.out.println("\nDisplaying list using enhanced for loop:");
        for (String name : studentNames) {
            System.out.println(name);
        }

        System.out.println("\nDisplaying list using iterator:");
        Iterator<String> iterator = studentNames.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
