package T2.HashSet;

import java.util.HashSet;
import java.util.Iterator;


public class Hash_set {
	
	public static void main(String[] args) {
        
        HashSet<Integer> rollNumbers = new HashSet<>();

      
        System.out.println("Adding roll numbers...");
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);
        rollNumbers.add(101); 
        rollNumbers.add(104);
        rollNumbers.add(105);
        rollNumbers.add(102); 
        rollNumbers.add(106);
        rollNumbers.add(107);
        rollNumbers.add(108);
        rollNumbers.add(103);
        rollNumbers.add(109);
        rollNumbers.add(110);

       
        System.out.println("\nTotal unique roll numbers stored: " + rollNumbers.size());
        
        
        System.out.println("\nAttempting to add duplicate roll number 101:");
        boolean added = rollNumbers.add(101);
        System.out.println("Was 101 added again? " + (added ? "Yes" : "No"));
        System.out.println("Current size: " + rollNumbers.size());

        
        System.out.println("\nAll roll numbers in the HashSet:");
        
        
        System.out.println("\nUsing enhanced for loop:");
        for (Integer roll : rollNumbers) {
            System.out.println(roll);
        }

        
        System.out.println("\nUsing Iterator:");
        Iterator<Integer> iterator = rollNumbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        
        System.out.println("\nUsing forEach:");
        rollNumbers.forEach(System.out::println);
    }

}
