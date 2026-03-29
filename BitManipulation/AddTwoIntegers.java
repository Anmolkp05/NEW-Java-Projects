package BitManipulation;

public class AddTwoIntegers {
    static void main() {
        System.out.println(getSum(2,3));
    }

//    TC = O(1) (constant time)
//    Sc = 0(1)  Only using:a, b, temp


    public static int getSum(int a, int b) {
        while (b!=0){
           int temp = (a&b)<<1;
           a=a^b;
           b = temp;

        }
        return a;


    }

}
