package Arrays;

public class FindTheMissingElement {
    public static void main(String[] args) {
        int[] arr ={1,2,3,5};
        System.out.println(missingNum(arr));
    }
    public static int missingNum(int[] arr) {
//  Tc= 0(N2)
//  SC = 0(1)
//       int n = arr.length+1;
//        for(int i = 1;i<=n;i++){
//            int flag = 0;
//            for(int j=0;j<n-1;j++) {
//                if (arr[j]==i) {
//                    flag = 1;
//                    break;
//                }
//
//            }
//            if(flag==0){
//                return i;
//            }
//        }
//        return -1;





//  Tc= 0(2N)
//  SC = 0(N)
//        int n = arr.length+1;
//        int[] hash = new int[n+1];
//
//        for(int i =0;i<n-1;i++){
//            hash[arr[i]]=1;
//        }
//        for(int i =1;i<=n;i++){
//            if(hash[i]==0){
//                return i;
//            }
//        }
//        return -1;

//  Tc= 0(N)
//  SC = 0(1)
//        int n = arr.length+1;
//        int sum  = (n*(n+1))/2;
//        int sum1 = 0;
//
//        for(int i =0;i<arr.length;i++){
//
//            sum1= sum1+ arr[i];
//        }
//
//        return sum-sum1;

//  TC=0(2N)/ after one loop it 0(1)
//  SC=(1)
        int x1 = 0;
        int x2 = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            x1 = x1 ^ arr[i];
            x2 = x2^(i+1);

        }
        x2 = x2 ^ (n + 1);

//        for (int i = 1; i <= n + 1; i++) {
//            x2 = x2 ^ i;
//        }
        //I CAN PUT THIS INSIDE UPPER ONE ..

        return x1 ^ x2;

        //1 ^ 2 ^ 3 ^ 4 ^ 5
        //4 ^ 1 ^ 5 ^ 2
        //(1 ^ 2 ^ 3 ^ 4 ^ 5) ^ (4 ^ 1 ^ 5 ^ 2)
        //= 1^1 ^ 2^2 ^ 4^4 ^ 5^5 ^ 3
        //= 0 ^ 0 ^ 0 ^ 0 ^ 3
        //= 3
        // for understanding



    }
}
