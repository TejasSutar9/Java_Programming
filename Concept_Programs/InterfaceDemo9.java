interface A
{
    int no=11;
    void fun();
    private void display()
    {
        System.out.println("Inside private Display");
    }
    default void gun()
    {
        System.out.println("Inside gun");
        display();
    }
}

class Demo implements A
{
    public void fun()
    {
        System.out.println("Inside fun");
    }
    
}

class InterfaceDemo9
{
    public static void main(String  A[])
    {
        Demo dobj = new Demo();
        dobj.fun();
        dobj.gun();
        // dobj.display();   //ERROR
    }
}