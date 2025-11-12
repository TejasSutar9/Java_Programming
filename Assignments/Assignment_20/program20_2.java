
class Logic
{
    void PrintReverse(int iNum)
    {
        int iCnt = 0;

        System.out.println("Reverse Numbers : ");

        for(iCnt = iNum; iCnt >= 1; iCnt--)
        {
            System.out.println(iCnt);
        }
                
    }
}

class program2_2
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.PrintReverse(10);
    }
}
