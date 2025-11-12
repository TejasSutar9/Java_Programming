class Logic
{
    void CheckEvenOdd(int iNum)
    {
        if((iNum % 2) == 0)
        {
            System.out.println(iNum+" is Even ");
        }
        else
        {
            System.out.println(iNum+" is Odd ");
        }
    }

}

class program2_2
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckEvenOdd(10);
    }
}