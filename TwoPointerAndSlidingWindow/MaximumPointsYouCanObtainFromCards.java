package TwoPointerAndSlidingWindow;

public class MaximumPointsYouCanObtainFromCards {
     public static void main(String[] args) {
         int[] arr = {1,2,3,4,5,6,1};
         int k =3;
         System.out.println(maxScore(arr,k));
    }
     public static int maxScore(int[] cardPoints, int k){
         int n = cardPoints.length;
         int leftSum=0,maxSum=0;

         for(int i=0;i<k;i++){
             leftSum =  leftSum+cardPoints[i];
             maxSum  = leftSum;
         }
         int rightSum=0;
         for(int j=k-1;j>=0;j--){
             leftSum=(leftSum-cardPoints[j]);
             rightSum = rightSum+cardPoints[n-1];
             n--;

             int Sum= leftSum+rightSum;
             maxSum = Math.max(maxSum,Sum);
         }
         return maxSum;
    }
}
