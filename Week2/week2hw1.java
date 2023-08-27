class HW
{
    public static void main(String a[])
    {
        int x = 1;
        int y = 2;
        System.out.println("the first number is:");
        System.out.println(x);
        System.out.println("the second number is:");
        System.out.println(y);
        int z = y;
        y = x;
        x = z;
        System.out.println("----Swapping commence----");
        System.out.println("now, the first number is:");
        System.out.println(x);
        System.out.println("and the second number is:");
        System.out.print(y);

    }
}
