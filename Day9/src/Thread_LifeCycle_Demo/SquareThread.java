package Thread_LifeCycle_Demo;

public class SquareThread extends Thread {

	public SquareThread() {
        setName("SquareThread");
        setPriority(8); 
    }

  
    public void run() {
    	
        System.out.println("Thread: " + getName() + " | Priority: " + getPriority());
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Square of " + i + " = " + (i * i));
            try {
                Thread.sleep(500); // Simulate delay
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted");
            }
        }
    }
	
}
