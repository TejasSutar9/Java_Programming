class Logic
{
    void PrintTable(int iNum)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            System.out.println(iNum+" x "+iCnt+" : "+iNum*iCnt);
        }
    }
}

class program5_5
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.PrintTable(5);
    }
}