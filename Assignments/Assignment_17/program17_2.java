
class Logic
{
    void CheckPalindrome(int iNum)
    {
        int iOriginal = iNum;
        int iReverse = 0, iDigit = 0;
        while(iNum != 0)
        {
            iDigit = iNum % 10;
            iReverse= (iReverse * 10) + iDigit;
            iNum = iNum / 10;
        }
        if(iOriginal == iReverse)
        {
            System.out.println(iReverse+" is Palindrome number");
        }
        else
        {
            System.out.println(iReverse+" is Not a Palindrome number");
        }
    }
}

class program2_2
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckPalindrome(132);
    }
}