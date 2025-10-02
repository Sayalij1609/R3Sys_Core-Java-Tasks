package Thread_LifeCycle_Demo;

public class TabelThread extends Thread{

	public TabelThread() {
        setName("TableThread");
        setPriority(3); 
    }

	
    public void run() {
        
    	System.out.println("Thread: " + getName() + " | Priority: " + getPriority());
        
    	for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted");
            }
        }
    }
}
