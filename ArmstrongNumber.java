public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(ArmstrongNumber(121 ));

    }
    public static boolean ArmstrongNumber(int n){
        if(n==0){
            return false;
        }
        else {
            int arm = n;
            int sum = 0 ;
            while(n!=0){
                int rem = n%10;
                sum = sum +(rem*rem*rem);

                n = n/10;

            }
            return sum == arm;
        }
    }

}
