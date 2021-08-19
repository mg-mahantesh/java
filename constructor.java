//student details using constructor........


import java.util.Scanner;
class student
{
    String name;
    String addr;
    int marks;
    student()
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the name:");
         name=sc.next();
         System.out.println("Enter the address:");
         addr=sc.next();
         System.out.println("Enter the Marks:");
         marks=sc.nextInt();
         System.out.println("Name of the student is "+name);
         System.out.println("Name of the student is "+addr);
         System.out.println("Name of the student is "+marks);
    }
}
class Main
{
    public static void main(String args[])
    {
        student s1=new student();
    }
}





/*.....Display the following values for a student using constructor,
Student name,Marks,address.....*/


public class Main {
    String stname;
    String staddr;
    int stmarks;
    
    
  public Main( String name,String addr,int marks) {
    stname = name;
    staddr = addr;
    stmarks=marks;
    
  }

  public static void main(String[] args) 
  {
    Main obj = new Main("nandakumar", "mysure",85);
    System.out.println(obj.stname + " " + obj.staddr+" "+obj.stmarks);
  }
}




/*...............constructor example..........*/

import java.util.Scanner;

 
public class Main 
{
  
 
public static void main (String[]args) 
  {
    
    Scanner sc = new Scanner (System.in);
    
    int n;
    
 
 
    System.out.println ("Enter the school name:");
    
    String ch = sc.nextLine ();
    
    System.out.println ("enter the number of student:");
    
    n = sc.nextInt ();
    
    String name[] = new String[n];
    
    String id[] = new String[n];
    
 
 
    for (int i = 0; i < n; i++)
      {
	
	
    System.out.print ("Enter name of student " + (i + 1) + ": ");
	
    name[i] = sc.next ();
	
    System.out.print ("Enter  student id " + (i + 1) + ": ");
	
    id[i] = sc.next ();
      
 
} 
 
 
 
      // String sn="SCHOOL";
      for (int i = 0; i < n; i++)
      {
	
 
System.out.println (name[i] + "\t" + id[i] + "\t" + ch);

} 
 
} 
} 
 
