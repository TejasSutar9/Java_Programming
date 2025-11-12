
class Logic
{
    void CheckPerfect(int iNum)
    {
        int iSum = 0, iCnt = 0;

        // Negative numbers cannot be perfect
        if(iNum <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        // Find all divisors (excluding the number itself)
        for(iCnt = 1; iCnt <= iNum / 2; iCnt++)
        {
            if(iNum % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        // Check if sum of divisors equals number
        if(iSum == iNum)
        {
            System.out.println(iNum + " is a Perfect Number");
        }
        else
        {
            System.out.println(iNum + " is not a Perfect Number");
        }
    }
}

class program3_3
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckPerfect(6);
    }
}
