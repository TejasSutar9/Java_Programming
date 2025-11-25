/*
    iRow = 4
    iCol = 4

    output: 
1       2       3       4
        2       3       4
                3       4
                        4

*/

import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        if(iRow != iCol)
        {
            System.out.println("Invalid Input");
            System.out.println("Row number and column number should be same");
            return;
        }

        for(i = 1; i <= iRow; i++)
        {
            // Print spaces
            for(j = 1; j < i; j++)
            {
                System.out.print("\t");
            }

            // Print numbers starting from i
            for(j = i; j <= iCol; j++)
            {
                System.out.print(j + "\t");
            }

            System.out.println();
        }
    }
}

class program31_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter number of rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);
    }
}
