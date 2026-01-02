package TwoPointerAndSlidingWindow;

import java.util.*;

public class FruitsIntoBasket {
    public static void main(String[] args) {

        int[] arr = {1,2,3,2,2,2};
        System.out.println(totalFruits(arr));
    }
    public static int totalFruits(int[] fruits){

        int maxFruits =0 ;

        //TC = O(N^2)  Xx
        //SC= 0(N) N= size of unique numbers (i.e) here

        /*
        for(int  i=0;i<fruits.length;i++){
            int currentFruit=0;
            HashSet<Integer> set = new HashSet<>();
            for(int j=i;j<fruits.length;j++){
                set.add(fruits[j]);
                if(set.size()<=2){
                    currentFruit++; // currentFruit  = j-i+1;
                }
                else {
                    break;
                }

                maxFruits = Math.max(currentFruit,maxFruits);
            }
        }*/

       /*
       //TC  = 0(2N)
       //SC = O(K ) NO of unique element in map

       int l=0,r=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(r<fruits.length){
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);
            if(map.size()>2) {
                while (map.size() > 2) {
                    map.put(fruits[l], map.get(fruits[l]) - 1);

                    if (map.get(fruits[l]) == 0) {
                        map.remove(fruits[l]);
                    }

                    l++;
                }
            }

            maxFruits = Math.max(maxFruits,r-l+1);
            r++;




        }

        */

        //TC  = 0(N)
        //SC = O(K ) NO of unique element in map
        int l=0,r=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(r<fruits.length){
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);
            if(map.size()>2) {
                map.put(fruits[l], map.get(fruits[l]) - 1);
                if (map.get(fruits[l]) == 0) {
                    map.remove(fruits[l]);
                }
                l++;

            }
            if(map.size()<=2) {

                maxFruits = Math.max(maxFruits, r - l + 1);

            }
            r++;




        }




        return  maxFruits;
    }
}
