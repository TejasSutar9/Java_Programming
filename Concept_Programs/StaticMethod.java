
class Demo
{
    public int i;
    static public int j=21;

    public Demo()
    {
        this.i=11;
    }
    public void fun()       // Instance Method
    {
        System.out.println("Fun i : "+this.i);
        System.out.println("Fun j : "+Demo.j);
    }
    public static void gun()       // class Method
    {
        // System.out.println("Gun i : "+this.i);    //Not Allowed (bcz of this also)
        System.out.println("Gun j : "+Demo.j);
    }
}

class StaticMethod
{
    public static void main(String A[]) 
    {
        Demo.gun();
        System.out.println(Demo.j);

        Demo dobj = new Demo();

        System.out.println(dobj.i);
        dobj.fun();
    }
}