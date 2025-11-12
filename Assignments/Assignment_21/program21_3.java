class Logic
{
    void DisplayFactors(int iNo)
    {
        int iCnt = 0, iFrequency = 0;

        System.out.println("Factors : ");

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {   
            if(iNo % iCnt == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class program3_3
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.DisplayFactors(12);
    }
}
