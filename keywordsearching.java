/*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    String keywords="break case continue default defer else";
	    String words[]=keywords.split(" ");
	    String str =new java.util.Scanner(System.in).nextLine();
	    for(String word : words)
	        if(word.equals(str)){
	            System.out.println(str+" is a keyword");
	            return;
	        }
	   System.out.println(str+" is not a keyword");
	}
}
