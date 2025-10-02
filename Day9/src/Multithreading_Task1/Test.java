package Multithreading_Task1;

public class Test {

	public static void main(String[] args) {
		
		Th1 t1 = new Th1();
		
		System.out.println("Before start - isAlive(): " + t1.isAlive());
		
		t1.start();
		
		try {
            t1.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("After completion - isAlive(): " + t1.isAlive());
		
		System.out.println("Thank You So much!!");
	}

}
