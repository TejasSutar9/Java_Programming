import java.io.*;
import java.util.*;

class program57_1
{
    public static void main(String A[])
    {
        try
        {
            String FileName1 = null;
            String FileName2 = null;
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter name of source file : ");
            FileName1 = sobj.nextLine();

            System.out.println("Enter name of destination file : ");
            FileName2 = sobj.nextLine();

            File src = new File(FileName1);
            File dest = new File(FileName2);

            if(!src.exists())
            {
                System.out.println("Source file does not exist");
                return;
            }

            FileReader frobj = new FileReader(src);
            FileWriter fwobj = new FileWriter(dest);

            int ch;
            while((ch = frobj.read()) != -1)
            {
                fwobj.write(ch);
            }

            frobj.close();
            fwobj.close();
            sobj.close();

            System.out.println("File copy successful");
            System.out.println("Destination file path: " + dest.getAbsolutePath());
        }
        catch(IOException e)
        {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}
