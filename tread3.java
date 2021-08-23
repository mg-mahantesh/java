class NewThread implements Runnable 
{
  Thread t;
  NewThread() 
  {
    t = new Thread(this, "Demo Thread"); 
    System.out.println("Child thread: " + t);
    t.start(); 
  }
 public void run() 
 {
	for(int i = 5; i > 0; i--) 
		 System.out.println("Child Thread: " + i);
    System.out.println("Exiting child thread.");
  }
}

public class Main {
    public static void main(String args[]) 
  {
    new NewThread(); 
    for(int i = 5; i > 0; i--)
        System.out.println("Main Thread: " + i);
    System.out.println("Main thread exiting.");
  }
}
