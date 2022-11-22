public class ReverseString {
    public static void main(String[] args) {

        String str = "Live Life";
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println(reverse);
    }
}
