class NewThread implements Runnable 
{
  Thread t;

  NewThread( String sname) 
  {
    t = new Thread(this, sname); 
    System.out.println("Child thread: " + t);
    t.start(); 
  }
 public void run() 
 {
	for(int i = 5; i > 0; i--) 
		 System.out.println("Child Thread: " + t.getName()+": "+i);
    System.out.println("Exiting child thread.");
  }
}

public class Main {
    public static void main(String args[]) 
  {
        NewThread c1=new NewThread("java1"); 
        NewThread c2=new NewThread("java2"); 
        NewThread c3=new NewThread("java3"); 
        NewThread c4=new NewThread("java4"); 
        NewThread c5=new NewThread("java5"); 
        
    for(int i = 5; i > 0; i--)
        System.out.println("Main Thread: " + i);
    System.out.println("Main thread exiting.");
  }
}
