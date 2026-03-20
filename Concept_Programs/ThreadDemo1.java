class ThreadDemo1
{
    public static void main(String A[])
    {
        System.out.println("Inside Main Method");

        String name = Thread.currentThread().getName();

        System.out.println("Name of current thread is : "+name);
    }
}