public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        String s = "AB";
        System.out.println(titleToNumber(s));
    }

        public static int titleToNumber(String columnTitle) {
            int result = 0 ;
            for(int i = 0 ;i<columnTitle.length();i++)
            {
                result = result*26+(columnTitle.charAt(i)-'A'+1);
            }
            return result;


        }
    }

