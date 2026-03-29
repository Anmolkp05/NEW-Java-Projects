package BitManipulation;

public class AddTwoIntegers {
    static void main() {
        System.out.println(getSum(2,3));
    }
    public static int getSum(int a, int b) {
        while (b!=0){
           int temp = (a&b)<<1;
           a=a^b;
           b = temp;

        }
        return a;


    }

}
