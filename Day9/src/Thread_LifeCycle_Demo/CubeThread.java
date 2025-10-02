package Thread_LifeCycle_Demo;

public class CubeThread extends Thread{
	
	public CubeThread() {
        setName("CubeThread");
        setPriority(5); 
    }


    public void run() {
        
    	System.out.println("Thread: " + getName() + " | Priority: " + getPriority());
        
    	for (int i = 1; i <= 5; i++) {
            System.out.println("Cube of " + i + " = " + (i * i * i));
            try {
                Thread.sleep(500); // Simulate delay
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted");
            }
        }
    }

}
