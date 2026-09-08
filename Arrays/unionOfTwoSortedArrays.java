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
        Set<Integer> set = new TreeSet<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int x : a) {
            set.add(x);
        }

        for (int x : b) {
            set.add(x);
        }



        for (int x : set) {
            ans.add(x);
        }





        return ans;
    }
}
