//Input : 5
//Output : 1 * 2 * 3 * 4 * 5 *
import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0, iCount = 0;

        iCount = 1;
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print(iCnt+"\t*\t");
        }
        System.out.println();
    }
}

class program26_3
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