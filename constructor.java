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
