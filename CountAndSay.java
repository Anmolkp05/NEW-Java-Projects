public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(1));
        System.out.println(countAndSay(2));
        System.out.println(countAndSay(3));
        System.out.println(countAndSay(4));
        System.out.println(countAndSay(5));

    }

        public static String countAndSay(int n) {

            String result = "1";

            for (int i = 2; i <= n; i++) {
                StringBuilder nextTerm = new StringBuilder();
                int count = 1;
                for (int j = 1; j < result.length(); j++) {
                    if (result.charAt(j) == result.charAt(j - 1)) {
                        count++;
                    } else {
                        nextTerm.append(count).append(result.charAt(j - 1));
                        count = 1; }
                }


                nextTerm.append(count).append(result.charAt(result.length() - 1));


                result = nextTerm.toString();
            }

            return result;
        }
    }



