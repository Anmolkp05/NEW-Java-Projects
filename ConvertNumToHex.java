public class ConvertNumToHex {
    public static void main(String[] args) {
        int number = 26;
        String hexString = toHexadecimal(number);
        System.out.println(hexString);

}
    public static String toHexadecimal(int number) {
        return Integer.toHexString(number);
    }
}
