class Logic
{
    void PrintDivisibleBy2And3(int iNo)
    {
        int iCnt = 0, iFrequency = 0;

        System.out.println("Number is divisible by both 2 and 3 are : ");
        
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {   
            if((iCnt % 2 == 0) && (iCnt % 3 == 0))
            {
                System.out.println("Number is : "+iCnt);
            }
        }
    }
}

class program5_5
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.PrintDivisibleBy2And3(30);
    }
}
