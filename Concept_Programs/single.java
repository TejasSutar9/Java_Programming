class Base              //8
{
    public int i,j;

    public void fun()
    {
        System.out.println("Inside Base Fun");
    }
}

class Derived extends Base      //12
{
    public int x;
    
    public void gun()
    {
        System.out.println("Inside Derived gun");
    }
}

class single
{
    public static void main(String Arr[])
    {
        Base bobj = new Base();
        Derived dobj = new Derived();

        bobj.fun();
        
        dobj.fun();
        dobj.gun();


    }
}