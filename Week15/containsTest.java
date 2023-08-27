public class containsTest {
    public static void main(String a[]) {
        String str = "have printed ////after";
        System.out.println(str);
        if (str.contains("////")) {
            str = str.substring(0, str.indexOf("////"));
            System.out.println("hi");
        }
        System.out.println(str);
    }
}
