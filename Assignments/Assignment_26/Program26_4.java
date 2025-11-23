//Input : 4
//Output : # 1 * # 2 * # 3 * # 4 *
import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0, iCount = 0;

        iCount = 1;
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print("#\t"+iCnt+"\t*\t");
        }
        System.out.println();
    }
}

class program26_4
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