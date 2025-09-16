public class FindTheMissingElement {
    public static void main(String[] args) {
        int[] arr ={1,2,3,5};
        System.out.println(missingNum(arr));
    }
    public static int missingNum(int[] arr) {
        int n = arr.length+1;
        int sum  = (n*(n+1))/2;
        int sum1 = 0;

        for(int i =0;i<arr.length;i++){

            sum1= sum1+ arr[i];
        }

        return sum-sum1;



    }
}
