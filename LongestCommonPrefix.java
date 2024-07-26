import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String strs[] = {"find", "find", "find"};
        System.out.println(longesCommonPrefix(strs));
    }

    public static String longesCommonPrefix(String strs[]) {
        if (strs.length == 0) {
            return "";
        }

        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length - 1];
        int index = 0;
        while (index < str1.length() && index < str2.length() && str1.charAt(index) == str2.charAt(index))
        {
            index++;
        }
        return str1.substring(0, index);

    }
}

