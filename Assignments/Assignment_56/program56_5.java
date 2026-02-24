import java.io.*;
import java.util.*;

class program56_5
{
    public static void main(String A[])     throws Exception
    {
        String FileName = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name of file : ");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.isDirectory())
        {
            String arr[] = fobj.list();
            System.out.println("Files in directory are : ");

            for(int i = 0; i < arr.length; i++)
            {
                System.out.println(arr[i]);
            }
        }
        else
        {
            System.out.println("Invalid directory name");
        }

        sobj.close();
    }
}