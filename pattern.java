/*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    String str =new java.util.Scanner(System.in).nextLine();
	    int i,n=str.length();
	    for(i=1;i<=n;i++)
	        System.out.println(String.format("%"+i+"c%"+(n*2-i*2)+"c",str.charAt(i-1),str.charAt(i-1)));
	    System.out.println(String.format("%"+i+"c",str.charAt(n-1)));
	    for(i=n-1;i>=1;i--)
	        System.out.println(String.format("%"+i+"c%"+(n*2-i*2)+"c",str.charAt(i-1),str.charAt(i-1)));
//System.out.println("");
	}
}
