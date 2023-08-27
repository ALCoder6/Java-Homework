public class EXRSE
{
    public static void main(String a[])
    {
        System.out.println("this is the main function");

        myPrinter result = new myPrinter();

        int num1 = 10;
        int num2 = 100;

        result.Print(num1, num2);

        addingStaticyayy.Print(num1, num2);
    }
}

public class myPrinter
    {
        public void Print(int start, int end)
        {
            for (int i = start; i <= end; i++)
                System.out.println(i);
        }
        
    }

public class addingStaticyayy
    {
        public static void Print(int start, int end)
        {
            for (int i = start; i <= end; i++)
                System.out.println(i);
        }
        
    }
