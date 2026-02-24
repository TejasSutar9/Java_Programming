import java.io.*;
import java.util.*;

class program56_3
{
    public static void main(String A[])         throws Exception
    {
        String FileName = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name of file : ");
        FileName = sobj.nextLine();

        FileWriter fwobj = new FileWriter(FileName,true);

        System.out.println("Enter data to append : ");
        String data = sobj.nextLine();

        fwobj.write(data);
        fwobj.write('\n');

        fwobj.close();
        sobj.close();
    }
}