class Logic
{
    void CountFactors(int iNo)
    {
        int iCnt = 0, iFrequency = 0;

        System.out.println("Factors : ");
        
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {   
            if(iNo % iCnt == 0)
            {
                System.out.println(iCnt);
                iFrequency++;
            }
        }
        System.out.println("Factors Count : "+iFrequency);
    }
}

class program4_4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CountFactors(20);
    }
}
