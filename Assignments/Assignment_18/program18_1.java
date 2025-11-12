class Logic
{
    void CheckPrime(int iNum)
    {
        int iCnt = 0;
        boolean isPrime = true;

        if(iNum <= 1)
        {
            System.out.println(iNum + " is not a Prime Number");
            return;
        }

        for(iCnt = 2; iCnt <= iNum / 2; iCnt++)
        {
            if((iNum % iCnt) == 0)
            {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println(iNum + " is a Prime Number");
        }
        else
        {
            System.out.println(iNum + " is not a Prime Number");
        } 
    }       
}

class program1_1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckPrime(11);
    }
}