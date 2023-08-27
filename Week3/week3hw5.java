class HW
{
    public static void main(String a[])
    {
        int num = 4;
        int equ = num%4;
        
        switch (equ)
        {
            case 1:
            {
                System.out.println("apple");
                System.exit(0);
            }
            case 2:
            {
                System.out.println("pear");
                System.exit(0);
            }
            case 3:
            {
                System.out.println("orange");
                System.exit(0);
            }
             default:
                 System.out.println("enter a valid number");
        }
        
    //----------------------------------------------------------------------
        
        // double num = 3;

        // if (num%4 == 0)
        //     {
        //         System.out.println(num + " (mod 4) is 0");
        //         System.exit(0);
        //     }
        // else if (num%4 == 1)
        //     {
        //         System.out.println(num + " (mod 4) is 1");
        //         System.exit(0);
        //     }
        // else if (num%4 == 2)
        //     {
        //         System.out.println(num + " (mod 4) is 2");
        //         System.exit(0);
        //     }
        // else if (num%4 == 3)
        //     {
        //         System.out.println(num + " (mod 4) is 3");
        //         System.exit(0);
        //     }
        // else
        //     System.out.println("please enter a valid number");
        
            
    }
}