
class Logic
{
    void SumEvenNumbers(int iNum)
    {
        int iSumE = 0, iCnt = 0;

        for(iCnt = 1; iCnt <= iNum; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iSumE = iSumE + iCnt;
            }
        }
        System.out.println("Sum of even number : "+iSumE);        
    }
}

class program1_1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.SumEvenNumbers(10);
    }
}
