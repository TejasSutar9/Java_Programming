
class Logic
{
    void PrintDigits(int iNum)
    {
        int iDigit = 0;

        if(iNum < 0)
        {
            iNum = -iNum;   
        }

        System.out.println("Digits are : ");
        while(iNum != 0)
        {
            iDigit = iNum % 10;
            System.out.println(iDigit);
            iNum = iNum / 10;
        }
        
    }
}

class program4_4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.PrintDigits(9876);
    }
}
