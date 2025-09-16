public class IsPrime {
    public static void main(String[] args) {
        int number = 11;
        System.out.println(isPrime1(number));
        System.out.println(isPrime2(number));

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {             //TC = O(sqrt(n))
            return false;
        }

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {               //Every prime number greater than 3 is in the form of 6k+-1 therefore we have here checked for 6k if it passed then it will show false value ... other than all are will be prime number
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime1(int n){
        int count=0 ;
        if(n<=1){
            return false;
        }
        for(int i=1;i<=n;i++){

            if(n%i==0){
                count++ ;                              // TC =O(n)
            }
            if(count>2){
                return false;
            }
        }
        return count==2;
    }
    public static boolean isPrime2(int n){
        int count=0 ;
        if(n<=1){
            return false;
        }
        for(int i=1;i*i<=n;i++){

            if(n%i==0){
                count++ ;                 // TC =O(sqrt(n))
                if(n/i!=i){
                    count++;
                }
            }
            if(count>2){
                return false;
            }
        }
        return count==2;
    }



}
