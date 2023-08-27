class HW
{
    public static void main(String a[])
    {
        byte x1 = 34;
        byte y1 = -45;

        if(x1 > 0 && y1 > 0)
            System.out.println("P(" + x1 + ", " + y1 +") is in Quadrant I");
        else if(x1 < 0 && y1 > 0)
            System.out.println("P(" + x1 + ", " + y1 +") is in Quadrant II");
    //code reuse am i right ( ͡° ͜ʖ ͡°)
        else if(x1 < 0 && y1 < 0)
            System.out.println("P(" + x1 + ", " + y1 +") is in Quadrant III");
        else if(x1 > 0 && y1 < 0)
            System.out.println("P(" + x1 + ", " + y1 +") is in Quadrant IV");
        else
            System.out.println("Given coordinate is on the x or y axis");
    }
}