//...example of "this" keyword in java......


class sample

{
    int x;
    float y;
    sample(){
        x=1;
        y=1.0f;
    }
    sample(float a)
    {
       this();
       y=a;
        
    }
    void displayxy()
    {
        System.out.println("x = "+x+" y = "+y);
    }
}
class Main{
    public static void main(String[] args){
       /* sample s1=new sample();
        s1.displayxy();*/
        
        sample s2=new sample(12.45f);
        s2.displayxy();
    }
}










