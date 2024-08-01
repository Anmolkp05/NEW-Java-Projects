class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        int columnNumber = 1;
        System.out.println(convertToTitle(columnNumber));
    }
    public static  String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            int r = (columnNumber - 1) % 26;
            sb.append((char) (r + 'A'));
            columnNumber = (columnNumber - 1) / 26;
        }
        return sb.reverse().toString();
    }
}













































//  String str = "";
//while(columnNumber>0 ){
//  columnNumber--;
//str = (char)(columnNumber%26 +'A')+str;
//
//          columnNumber = columnNumber /26 ;
//
//      }


//    return str;
//}
//}



