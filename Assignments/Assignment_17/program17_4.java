class Logic
{
    void FindMin(int iNo1, int iNo2, int iNo3)
    {
        if((iNo1 < iNo2) && (iNo1 < iNo3))
        {
            System.out.println(iNo1+" is a Minimum Number");
        }
        else if(iNo2 < iNo3)
        {
            System.out.println(iNo2+" is a Minimum Number");
        } 
        else
        {
            System.out.println(iNo3+" is a Minimum Number");
        }
    }
}

class program4_4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.FindMin(3 , 7 , 2);
    }
}