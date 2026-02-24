import java.io.*;
import java.util.*;

class program58_5
{
    public static void main(String A[]) throws Exception
    {
        String Header = null;
        int iRet = 0, i = 0, j = 0;

        byte Buffer[] = new byte[1024];
        byte bHeader[] = new byte[100];

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter folder name : ");
        String FolderName = sobj.nextLine();

        System.out.println("Enter packed file name : ");
        String PackName = sobj.nextLine();

        File fobj = new File(FolderName);

        if(fobj.exists() && fobj.isDirectory())
        {
            File PackObj = new File(PackName);
            PackObj.createNewFile();

            FileOutputStream foobj = new FileOutputStream(PackObj);
            FileInputStream fiobj = null;

            File fArr[] = fobj.listFiles();

            for(i = 0; i < fArr.length; i++)
            {
                if(fArr[i].isFile() && fArr[i].getName().endsWith(".txt"))
                {
                    // Header = FileName + FileSize
                    Header = fArr[i].getName() + " " + fArr[i].length();

                    for(j = Header.length(); j < 100; j++)
                    {
                        Header = Header + " ";
                    }

                    bHeader = Header.getBytes();

                    // Write header
                    foobj.write(bHeader, 0, 100);

                    // Write file data
                    fiobj = new FileInputStream(fArr[i]);
                    while((iRet = fiobj.read(Buffer)) != -1)
                    {
                        foobj.write(Buffer, 0, iRet);
                    }
                    fiobj.close();
                }
            }

            foobj.close();
            System.out.println("Files packed successfully (Name + Size + Data)");
        }
        else
        {
            System.out.println("Invalid folder name");
        }

        sobj.close();
    }
}