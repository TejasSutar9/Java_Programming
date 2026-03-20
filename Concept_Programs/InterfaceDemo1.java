interface Demo
{
    int no=11;
    void display();
    
}

class Hello implements Demo
{
    //ERROR
}


class InterfaceDemo1
{
    public static void main(String  A[])
    {
        Hello obj = new Hello();    
    }
}