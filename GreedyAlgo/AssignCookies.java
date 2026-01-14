package GreedyAlgo;

import java.util.*;
public class AssignCookies {
    static void main() {
        int[] student = {1, 2};
        int[] cookie = {1, 2, 3};
        System.out.println(findContentChildren(student,cookie));
    }
    public static  int findContentChildren(int[] g, int[] s) {
        int n = g.length;
        int m = s.length;
        int l = 0,r=0;
        Arrays.sort(s);
        Arrays.sort(g);

        while (l < m && r<n) {
            if (s[l] >= g[r]) {
                r++;
            }
            l++;
        }

        return r;
    }
}
