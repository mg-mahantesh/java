import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    String  str=new java.util.Scanner(System.in).nextLine();
	    int n=0,m=0,i;
	   
	   
	   for( i=0;i<str.length();i++)
	        if(i%2==0)
	            m=m+Character.getNumericValue(str.charAt(i));
	        else
	            n=n+Character.getNumericValue(str.charAt(i));
	    System.out.println((m-n));
	    
	    
	}
}
