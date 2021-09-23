public class Main{
 public static void main (String[] args) {
        java.util.Scanner in=new java.util.Scanner(System.in);
        int max=Integer.MIN_VALUE;
        int smax=max,n;
        n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            int x=in.nextInt();
            if(x>max){
                smax=max;
                max=x;
            }
            else if(x>max){
                smax=x;
                
            }
        }
        System.out.println(smax);
    }
}
