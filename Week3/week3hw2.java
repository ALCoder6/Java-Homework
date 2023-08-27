class HW
{
    public static void main(String a[])
    {
        int w = 2;
        int x = 1;
        int y = -1;
        int z = 0;

        if(w >= x && w >= y && w >= z)
            System.out.println(w + " is the greatest number");
        else if(x >= w && x >= y && x >= z)
            System.out.println(x + " is the greatest number");
        else if(y >= w && y >= x && y >= z)
            System.out.println(y + " is the greatest number");
        else 
            System.out.println(z + " is the greatest number");
    }
}