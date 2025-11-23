//Input : 5
//Output : A B C D E 
import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < iNo; iCnt++)
        {
            char ch = (char)('A' + iCnt);
            System.out.print(ch+"\t");
        }
        System.out.println();
    }
}

class program26_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the frequency : ");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);
    }
}