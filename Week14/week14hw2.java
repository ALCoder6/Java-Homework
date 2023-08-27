class HW {
    public static void main(String a[]) {
        String value = "25";
        int newValue = Integer.parseInt(value);
    
        System.out.println(value + " is of type " + value.getClass().getSimpleName());
        System.out.println(newValue + " is of type " + ((Object)newValue).getClass().getSimpleName());
    }
}
