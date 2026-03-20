interface Demo
{
    int no=11;
    void display();
    
}

abstract class Hello implements Demo
{
    
}


class InterfaceDemo2
{
    public static void main(String  A[])
    {
        Hello obj = new Hello();            //ERROR  
    }
}