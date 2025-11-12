
class Logic
{
    void FindLargestDigit(int iNum)
    {
        int iDigit = 0;
        int iLargest = 0;

        if(iNum < 0)
        {
            iNum = -iNum;  // Handle negative numbers
        }

        while(iNum != 0)
        {
            iDigit = iNum % 10;    // Get last digit

            if(iDigit > iLargest)
            {
                iLargest = iDigit; // Update if larger digit found
            }

            iNum = iNum / 10;      // Remove last digit
        }

        System.out.println("Largest digit is: " + iLargest);
    }
}

class program4_4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.FindLargestDigit(83429);
    }
}
