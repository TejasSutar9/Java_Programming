import java.io.*;
import java.util.*;

class program58_2
{
    public static void main(String A[]) throws Exception 
    {
        FileOutputStream foobj = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name : ");
        String DictName = sobj.nextLine();

        
        File fobj = new File(DictName);

        if(fobj.exists() && fobj.isDirectory())
        {
            File fileslist[] = fobj.listFiles();

            File Destfile = new File("Marvellous.txt");
            Destfile.createNewFile();

            foobj = new FileOutputStream(Destfile);

            for(int i = 0; i < fileslist.length; i++)
            {
                if(fileslist[i].isFile())
                {
                    String fname = fileslist[i].getName();

                    foobj.write(fname.getBytes());
                    
                }
            }

            foobj.close();
            System.out.println("File names written successfully into Marvellous.txt");
        }
        else
        {
            System.out.println("Invalid Directory name");
        }

        sobj.close();
    }
    
}