package Multithreading_Task1;

public class Th1 extends Thread {
	
	 public Th1(){
		 setName("CountDown Timer");
	 }

	 public void run(){
		 
		 for(int i = 10 ; i> 0 ; i--){
			 System.out.println(i);
		 try {
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	 }
		 
   }
}
