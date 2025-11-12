class Logic
{
    void FindFactorial(int iNum)
    {
        int iCnt = 0, iFactorial = 1;

        for(iCnt = 1; iCnt <= iNum; iCnt++)
        {
            iFactorial = iFactorial * iCnt;
        }
        System.out.println("Factorial is : "+iFactorial);
    }

}

class program3_3
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.FindFactorial(5);
    }
}