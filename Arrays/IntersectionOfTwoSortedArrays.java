package Arrays;

import java.util.ArrayList;
public class IntersectionOfTwoSortedArrays {
    public static void main() {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {2, 4, 6, 7, 8};

        System.out.println(intersection(arr1,arr2));
    }
    public static ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        //TC = 0(a*b)
        //sc = 0(b)
//        ArrayList<Integer> ans = new ArrayList<>();
//        int a = arr1.length;
//        int b = arr2.length;
//        int[] visited = new int[b];
//        for(int i =0;i<a;i++){
//            for(int j=0;j<b;j++){
//                if(arr1[i]==arr2[j] && visited[j]==0){
//                    ans.add(arr1[i]);
//                    visited[j]++ ;
//                    break;
//
//                }
//                if(arr1[i]<arr2[j]){
//                    break;
//                }
//            }
//        }
//
//
//        return ans;

        //TC = 0(A+B)
        //SC = 0(1)
        ArrayList<Integer> ans = new ArrayList<>();
        int a = arr1.length;
        int b = arr2.length;

        int i=0;
        int j = 0;
        while(i<a && j<b){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                ans.add(arr1[i]);
                i++;
                j++;
            }


        }
        return ans;

    }
}
