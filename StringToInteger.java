public class StringToInteger {
    public static void main(String[] args) {

        System.out.println(myAtoi("42"));
        System.out.println(myAtoi("   -42"));
        System.out.println(myAtoi("4193 with words"));
        System.out.println(myAtoi("words and 987"));
        System.out.println(myAtoi("-91283472332"));

    }
    public static int myAtoi(String str) {

        str = str.trim();

        if (str.isEmpty()) {
            return 0;
        }

        int index = 0;
        int sign = 1;
        int result = 0;

        if (str.charAt(index) == '+' || str.charAt(index) == '-') {
            sign = (str.charAt(index) == '-') ? -1 : 1;
            index++;
        }

        while (index < str.length() && Character.isDigit(str.charAt(index))) {
            int digit = str.charAt(index) - '0';

            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }

        return result * sign;
    }
}


