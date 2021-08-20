/*.......throw Exception.......*/





class virus extends Exception {
    
    String msg;
    virus(String a){
        msg=a;
    }
    String dispmsg(){
        return msg;
    }
}
public class Main {  
  
    public static void main(String[] args) {  
          
           try{    
                  
               int a=10;
               int b=0;
               if(b==0)
                
                   throw new virus("hahaha");
               System.out.println("after throw");
               
               int c=a/b;
               System.out.println("c="+c);
               
              }    
               catch(virus s)  
                  {  
                   System.out.println("catch:"+s.dispmsg());  
                  }    
                finally{
                    System.out.println("caught virus");
                }
             
        
    }  
    
}  
