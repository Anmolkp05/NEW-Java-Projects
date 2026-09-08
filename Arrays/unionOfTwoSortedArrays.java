package Arrays;

import java.util.ArrayList;

import java.util.Set;
import java.util.TreeSet;

public class unionOfTwoSortedArrays {
    static void main() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 6, 7};

        System.out.println(findUnion(a,b));

    }
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
//       tc=O((N + M) log(N + M))
//       sc= 0(N+M)+0(K)
//        Set<Integer> set = new TreeSet<>();//Tree set is used as treeset is ordered set  - O(N + M)
//        ArrayList<Integer> ans = new ArrayList<>();  // O(K)
//        for (int x : a) {
//            set.add(x);  //takes O(log K) because it is backed by a balanced tree For N elements: O(N log K) where N = a.length & K = unique element
//        }
//        for (int x : b) {
//            set.add(x);  //(MlogK)   m= b.length
//        }
//        for (int x : set) {
//            ans.add(x);   // 0(k)
//        }
//        return ans;


        //Tc = 0(N+M)
        //SC = O(N + M)  including result , but the auxiliary result is 0(1)
        int i = 0;
        int j =0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                if(ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                    ans.add(a[i]);
                }
                i++;
            }
            else {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
                    ans.add(b[j]);
                }
                j++;
            }
        }
        // Remaining elements of a
        while (i < a.length) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                ans.add(a[i]);
            }
            i++;
        }

// Remaining elements of b
        while (j < b.length) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
                ans.add(b[j]);
            }
            j++;
        }
        return ans;
    }
}
