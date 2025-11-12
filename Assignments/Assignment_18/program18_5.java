class Logic
{
    void CheckSign(int iNum)
    {
        if(iNum > 0)
        {
            System.out.println(iNum + " is Positive");
        }
        else if(iNum == 0)
        {
            System.out.println(iNum + " is Zero");
        }
        else
        {
            System.out.println(iNum + " is Negative");
        }
    }       
}

class program5_5
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckSign(-8);
    }
}