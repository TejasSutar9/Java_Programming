/*
    iRow = 4
    iCol = 4

    output :
2       4       6       8
1       3       5       7
2       4       6       8
1       3       5       7

*/
import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if((i % 2) == 0)      
                {
                    System.out.print((2 * j - 1)+ "\t");
                }
                else
                {
                    System.out.print((2 * j)+"\t");
                }
            }
            System.out.println();
        }
    }
}

class program29_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter number of rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter number of rows : ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);
    }
}