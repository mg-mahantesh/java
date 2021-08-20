/*....throw Exception in java.....*/


public class Main {  
  
    public static void main(String[] args) {  
          
           try{    
                  
               int a=10;
               int b=0;
               if(b==0)
                
                   throw new ArithmeticException("manual throw");
               System.out.println("after throw");
               
               int c=a/b;
               System.out.println("c="+c);
               
              }    
               catch(ArithmeticException e)  
                  {  
                   System.out.println("catch:"+e.getMessage());  
                  }    
                finally{
                    System.out.println("hello word-finally");
                }
             
        
    }  
    
}  
