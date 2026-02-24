import java.io.*;
import java.util.*;

class program56_1
{
    public static void main(String A[])      throws Exception
    {
        String FileName = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name of file : ");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            System.out.println("File opened successfully");
        }
        else
        {
            fobj.createNewFile();
            System.out.println("File did not exist, new file created");
        }

        fobj.close();
        sobj.close();
    }
}