class Logic
{
    void SumEvenOddDigits(int iNum)
    {
        int iSumE = 0, iSumO = 0, iDigit = 0;

        while(iNum != 0)
        {
            iDigit = iNum % 10;

            if((iDigit % 2) == 0)
            {
                iSumE = iSumE + iDigit;
            }
            else
            {
                iSumO = iSumO + iDigit;
            }

            iNum = iNum / 10;
        }
        System.out.println("Sum of all even digits : "+iSumE);
        System.out.println("Sum of all odd digits : "+iSumO);
    }       
}

class program4_4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.SumEvenOddDigits(123456);
    }
}