import java.io.*;
import java.util.*;

class program58_1
{
    public static void main(String A[]) throws Exception 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name : ");
        String DictName = sobj.nextLine();

        File fobj = new File(DictName);

        if(fobj.exists() && fobj.isDirectory())
        {
            File fileslist[] = fobj.listFiles();

            System.out.println("Regular Files in directory are : ");

            for(int i = 0; i < fileslist.length; i++)
            {
                if(fileslist[i].isFile())
                {
                    System.out.println("File Name : " + fileslist[i].getName());
                }
            }
        }
        else
        {
            System.out.println("Invalid Directory name");
        }

        sobj.close();
    }   
}
