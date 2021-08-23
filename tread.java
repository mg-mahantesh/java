/*.....thread in java.....*/

class Main{
         public static void main (String[] args) {
        
        Thread t=Thread.currentThread();
        System.out.println();
        System.out.println("current Thread:"+t);
        t.setName("my thread");
        System.out.println("aftee name change:"+t);
        try{
            for(int n=5;n>0;n--)
            {
                System.out.println(n);
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e){
            System.out.println("main thrad interrupted");
        }
        
        
    }
}
