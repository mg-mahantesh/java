/*.......throws keyword in java.....*/

class samplepgm {
    
    
    int calculatev(int a,int b)throws ArithmeticException
    {
        return(a/b);
    }
}

public class Main{
 public static void main (String[] args) {
        samplepgm sp=new samplepgm();
        try{
            System.out.println("value is:"+sp.calculatev(10,0));
            
        }
        catch(ArithmeticException s){
            System.out.println("caught:"+s.getMessage());
        }
    }
}
