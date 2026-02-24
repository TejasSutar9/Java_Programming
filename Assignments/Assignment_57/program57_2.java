import java.io.*;
import java.util.*;

class program57_2
{
    public static void main(String A[])  throws Exception
    {
        
            String FileName = null;

            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter file name : ");
            FileName = sobj.nextLine();

            File fobj = new File(FileName);

            if(fobj.isFile())
            {
                System.out.println("It is regular file");
            }
            else
            {
                System.out.println("It is not a regular file");
            }

            sobj.close();
        
    }
}