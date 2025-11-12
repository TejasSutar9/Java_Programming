class Logic
{
    void ReverseNumber(int iNum)
    {
        int iReverse = 0, iDigit = 0;

        while(iNum != 0)
        {
         iDigit = iNum % 10;
         iReverse = (iReverse * 10) + iDigit;   
         iNum = iNum / 10;
        }
        System.out.println("Reversed Number: " + iReverse);
    }

}

class program4_4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.ReverseNumber(1234);
    }
}