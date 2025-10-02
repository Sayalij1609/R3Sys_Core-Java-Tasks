package Thread_LifeCycle_Demo;

public class Test {
	
 public static void main(String args []){
	 
	 SquareThread sq = new SquareThread();
     CubeThread cu = new CubeThread();
     TabelThread tb = new TabelThread();

    
     System.out.println("Before starting:");
     System.out.println(sq.getName() + " is alive: " + sq.isAlive());
     System.out.println(cu.getName() + " is alive: " + cu.isAlive());
     System.out.println(tb.getName() + " is alive: " + tb.isAlive());

   
     sq.start();
     cu.start();
     tb.start();


     System.out.println("\nAfter starting:");
     System.out.println(sq.getName() + " is alive: " + sq.isAlive());
     System.out.println(cu.getName() + " is alive: " + cu.isAlive());
     System.out.println(tb.getName() + " is alive: " + tb.isAlive());

     
     try {
    	 sq.join();
    	 cu.join();
    	 tb.join();
     } catch (InterruptedException e) {
         System.out.println("Main thread interrupted");
     }

     System.out.println("\nAfter completion:");
     System.out.println(sq.getName() + " is alive: " + sq.isAlive());
     System.out.println(cu.getName() + " is alive: " + cu.isAlive());
     System.out.println(tb.getName() + " is alive: " + tb.isAlive());

     System.out.println("\nAll threads completed.");
	 
 }
	
}
