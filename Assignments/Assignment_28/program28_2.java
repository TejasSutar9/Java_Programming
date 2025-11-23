/*
    iRow = 4
    iCol = 3

    A   B   C   D
    a   b   c   d
    A   B   C   D
    a   b   c   d
    
*/
import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        char ch = '\0';

        for(i = 1; i <= iRow; i++)
        {
            if((i % 2) == 0)
            {
                ch = 'a';     
            }
            else
            {
                ch = 'A';     
            }

            for(j = 1; j <= iCol; j++, ch++)
            {
                System.out.print(ch + "\t");
            }
            System.out.println();
        }
    }
}

class program28_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter the number of rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of columns : ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);

    }
}