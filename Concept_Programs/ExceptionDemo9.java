import java.util.*;

class ExceptionDemo9
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = {10,20,30,40,50};
        int iIndex = 0,idata = 0;

        System.out.println("Enter the index number : ");
        iIndex = sobj.nextInt();

        idata = Arr[iIndex];            //EXCEPTION PRONE CODE

        System.out.println("Element at that index is : "+idata);
    }
}