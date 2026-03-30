package BitManipulation;

public class NumberOf1Bits {
    static void main() {

        System.out.println(hammingWeight( 2));
    }
    public static int hammingWeight(int n) {
//  Time Complexity: O(1) Loop runs 32 times (fixed) Doesn’t depend on input size
//  Space Complexity: O(1) Only using a variable count
//        int count=0 ;
//        for(int i = 31 ; i>=0 ; i--){
//        if(((n>>i)&1)==1){
//               count += 1 ;
//            }
//        }
//        return count;

//  Brian Kernighan’s Algorithm
//  Time Complexity: O(k) number of set bits (1s)
//  Space Complexity: O(1) Only using a variable count
//        int count=0;
//        while(n!=0){
//            n=(n&(n-1));
//            count+=1;
//   like (3&2) krne   se ek set bit 0 hota hai so loop se sara ek ek krke 0 ho jayega and we can calculate also
//
//        }
//        return count;



//        Time Complexity: O(log2(n)) Each division by 2 reduces size
//  Space Complexity: O(1) Only using a variable count
//        int count=0;
//        while(n!=0){
//            count += (n%2);
//            n = n/2;
//        }
//        return count;
//
//    }


//  Built-in Method
//  Time Complexity:O(1) (effectively constant)
//  Space Complexity: O(1) Only using a variable count
        return Integer.bitCount(n);
    }

}
