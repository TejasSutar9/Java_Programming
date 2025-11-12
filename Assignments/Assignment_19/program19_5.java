
class Logic
{
    void CalculatePower(int iBase, int iExponent)
    {
        int iResult = 1 , iCnt = 0;

        for(iCnt = 1; iCnt <= iExponent; iCnt++)
        {
            iResult = iResult * iBase;
        }

        System.out.println(iBase + " raised to the power " + iExponent + " is: " + iResult);
    }
}

class program5_5
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CalculatePower(2 , 5);
    }
}
