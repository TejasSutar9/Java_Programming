class Logic
{
    void FindMax(int iNo1, int iNo2)
    {
        if(iNo1 > iNo2)
        {
            System.out.println(iNo1+" is a Maximum Number");
        }
        else
        {
            System.out.println(iNo2+" is a Maximum Number");
        } 
    }
}

class program3_3
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.FindMax(20 , 15);
    }
}