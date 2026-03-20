import java.util.Scanner;

class SelectionDemo1
{
    public static void main(String Arr[])
    {
        Scanner sobj=new Scanner(System.in);
        int iNo=0;
      
        System.out.println("Enter Number : ");
        iNo=sobj.nextInt();

        if(iNo>=18)
        {
            System.out.println("You can vote");
        }
        else
        {
            System.out.println("You can't vote");
        }

    }
}