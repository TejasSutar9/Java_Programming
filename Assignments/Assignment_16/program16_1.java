class Logic
{
    void CalculateSum(int iNo)
    {
        int iSum = 0;

        
            iSum = (iNo * (iNo + 1) / 2);
        
        System.out.println("Sum of first N Natural number : "+iSum);
    }

}

class program1_1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CalculateSum(10);
    }
}