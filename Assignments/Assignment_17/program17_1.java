class Logic
{
    void SumOfDigits(int iNum)
    {
        int iSum = 0, iDigit = 0;
        while(iNum != 0)
        {
            iDigit = iNum % 10;
            iSum = iSum + iDigit;
            iNum = iNum / 10;
        }
        System.out.println("Sum of digits of a number : "+iSum);
    }
}

class program1_1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.SumOfDigits(9999);
    }
}