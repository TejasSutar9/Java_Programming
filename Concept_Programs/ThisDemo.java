class Demo
{
    public int i;
    public static int j;

    static 
    {
        j=21;
    }

    public Demo()
    {
        System.out.println("Inside default");
        this.i=11;                                  //First Use
    }

    public Demo(int a)
    {
        this();                                     //Second Use
        System.out.println("Inside parameterized");
    }

    public void Display()
    {
        System.out.println("Inside Display"+this.i); //Third Use
    }
}

class ThisDemo
{
    public static void main(String A[])
    {
        Demo dobj = new Demo(51);
        dobj.Display();

    }
}