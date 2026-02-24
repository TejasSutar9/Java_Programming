import java.io.*;
import java.util.*;

class program56_2
{
    public static void main(String A[])     throws Exception
    {
        String FileName = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name of file : ");
        FileName = sobj.nextLine();

        FileReader frobj = new FileReader(FileName);

        int ch;
        while((ch = frobj.read()) != -1)
        {
            System.out.print((char)ch);
        }

        frobj.close();
        sobj.close();
    }
}