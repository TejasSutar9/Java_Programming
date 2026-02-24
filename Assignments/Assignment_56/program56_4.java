import java.io.*;
import java.util.*;

class program56_4
{
    public static void main(String A[])     throws Exception
    {
        String FileName = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name of file : ");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.createNewFile())
        {
            System.out.println("File created successfully");
        }

        else
        {
            System.out.println("File already exists");
        }

        fobj.close();
        sobj.close();
    }
}