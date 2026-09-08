public class MaxConsecutiveBits {
    static void main() {
        int[] arr = {0, 1, 0, 1, 1, 1, 1};
        System.out.println(maxConsecBits(arr));
    }
    public static int maxConsecBits(int[] arr) {
        int max1 = 0;
        int max2 = 0;
        int count0 = 0;
        int count1 = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count1++;
                count0 = 0;
                max1 = Math.max(max1,count1);
            }else{
                count0++;
                count1 = 0;
                max2 = Math.max(max2,count0);
            }
        }
        return Math.max(max1,max2);

    }
}
