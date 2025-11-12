class Logic
{
    void CountEvenOddRange(int iNo)
    {
        int iCnt = 0, iDigit = 0, iFrequency1 = 0, iFrequency2 = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iFrequency1++;
            }
            else
            {
                iFrequency2++;
            }
        }
        System.out.println("Even Numbers : "+iFrequency1);
        System.out.println("Odd Numbers : "+iFrequency2);
    }
}

class program2_2
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CountEvenOddRange(50);
    }
}
