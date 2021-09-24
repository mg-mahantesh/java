public class Main
{
    int genFibonacci(int n){
        int n1,n2,n3;
        n1=1;
        n2=0;
        for(int i=1;i<=n;i++){
            n3=n1 + n2;
            n1=n2;
            n2=n3;
           
        }
        return n2;
    }
    static boolean isPrime(int n) {
    if(n==0 || n==1)
    return false;
    else if(n > 3 && (n%2==0 || n%3==0))
    return false;
    else{
        for(int i=5;i*i<=n;i+=6)
        if(n % i == 0 || n % (i+2) == 0)
            return false;
        return true;
         }
    }
    static int genPrime(int n) {
        int i;
        for(i=2;n>0;i++)
            if(isPrime(i))
            n--;
        return i-1;
       
    }
   
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        if(n % 2 == 0)
    System.out.println(genPrime(n/2));
    else
    System.out.println(genPrime(n/2+1));
}
}
