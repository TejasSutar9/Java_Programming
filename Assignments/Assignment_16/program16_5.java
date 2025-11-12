class Logic
{
    void CountDigit(int iNum)
    {
        int iFrequency = 0, iDigit = 0;

        while(iNum != 0)
        {
         iDigit = iNum % 10;
         iFrequency++;   
         iNum = iNum / 10;
        }
        System.out.println("Number of Digits are : " + iFrequency);
    }

}

class program5_5
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CountDigit(7865);
    }
}