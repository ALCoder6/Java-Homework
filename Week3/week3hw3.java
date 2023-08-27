class HW
{
    public static void main(String a[])
    {
        int x = 2;
        int y = -1;
        int z = 0;

        if(x >= y && x >= z)
        {
            System.out.println(x);
            if(y >= z)
                {
                    System.out.println(y);
                    System.out.println(z);
                }
            else
                {
                    System.out.println(z);
                    System.out.println(y);
                }
        }
        else if(y >= x && y >= z)
        {
            System.out.println(y);
            if(x >= z)
                {
                    System.out.println(x);
                    System.out.println(z);
                }
            else
                {
                    System.out.println(z);
                    System.out.println(x);
                }
        }
        else 
        {
            if(z >= x && z >= y)
                System.out.println(z);
                if (x >= y)
                {
                    System.out.println(x);
                    System.out.println(y);
                }    
            else
                {
                    System.out.println(y);
                    System.out.println(x);
                }
        }
    }
}