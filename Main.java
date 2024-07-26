public class Main {
    static class IntegerToRoman {
        public String intToRoman(int num) {
            String roman ="";
            int[] value = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
            String[] romanletters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

            for(int i=0; i<value.length; i++){
                while(num >= value[i]){
                    roman = roman+romanletters[i];
                    num = num-value[i]  ;
                }
            }
            return roman;
        }
    }


    public static void main(String[] args) {
        IntegerToRoman I = new IntegerToRoman();
        System.out.println( );


    }
}





