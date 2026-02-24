import java.io.*;
import java.util.*;

class program57_5
{
    public static void main(String A[])
    {
        String DirName;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name : ");
        DirName = sobj.nextLine();

        File fobj = new File(DirName);

        if(fobj.isDirectory())
        {
            File arr[] = fobj.listFiles();

            for(int i = 0; i < arr.length; i++)
            {
                System.out.println("File name : "+arr[i].getName() + "  Size : " + arr[i].length());
            }
        }
        else
        {
            System.out.println("Invalid directory");
        }

        sobj.close();
    }
}
