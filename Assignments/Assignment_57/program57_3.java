import java.io.*;
import java.util.*;

class program57_3
{
    public static void main(String A[])     throws Exception
    {
        
            String DirName = null;

            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter file name : ");
            DirName = sobj.nextLine();

            File fobj = new File(DirName);

            if(fobj.mkdir())
            {
                System.out.println("Directory created succesfully");
            }
            else
            {
                System.out.println("Directory already exists or cannot be created");
            }

            sobj.close();
    }
}