import java.io.*;
import java.util.*;

class program57_4
{
    public static void main(String A[]) throws Exception
    {
        String FileName;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name : ");
        FileName = sobj.nextLine();

        FileInputStream fiobj = new FileInputStream(FileName);

        int ch;
        int checksum = 0;

        while((ch = fiobj.read()) != -1)
        {
            checksum = checksum + ch;
        }

        fiobj.close();
        sobj.close();

        System.out.println("Checksum of file is : " + checksum);
    }
}
