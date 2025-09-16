import java.util.HashMap;
import java.util.Scanner;

import static java.util.Objects.hash;

public class Hashing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                                                        // Number Hashing

        //int[] arr = {2,3,5};            //input already given


        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {       //taking input from user
            arr[i] = sc.nextInt();
        }


        //HashMap<Integer, Integer> frequencyMap = computeFrequencies(arr);                   //for hashmap
        //handleQueries(frequencyMap, sc);


        int[] hash = new int[13];
        computeFrequencies(arr, hash);                    //for array simple
        handleQueries(hash, sc);

        sc.close();

                                            //Character Hashing


       // char[] arr = {'a','b','c'};


       /* int n = sc.nextInt();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {       //taking input from user
            arr[i] = sc.next().charAt(0);
        }

        String s;                   //using string no array
        s = sc.next();




        int[] hash = new int[26];

        computeCharFrequencies1(s, hash);       //using string
        //computeCharFrequencies(arr, hash);  //using array


        handleCharQueries(hash, sc);                     //same for both

        sc.close();
        */



    }


                                        //Number Hashing


    public static void computeFrequencies(int[] arr, int[] hash) {
        for (int i = 0; i < arr.length; i++) {                                          //Hash using array
            hash[arr[i]] += 1;         }
    }




                                //HASHMAP

    /*public static HashMap<Integer, Integer> computeFrequencies(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();                                  //using hashmap - TC = O(n+q)

        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int freq = 0;
            if (mp.containsKey(key)) {
                freq = mp.get(key);
            }

            freq++;
            mp.put(key, freq);
        }return mp;
    }*/


    //For array
    public static void handleQueries(int[] hash, Scanner sc) {

        //for hashmap
    //public static void handleQueries(HashMap<Integer, Integer> mp, Scanner sc){
            int q = sc.nextInt();
            while (q-- > 0) {                                                                   //same for all
                int number = sc.nextInt();
                System.out.println(hash(number));       //for hash


                //if (mp.containsKey(number))
                //    System.out.println(mp.get(number));            //for hashmap
                //else
                //    System.out.println(0);

            }
        }
                                            //Character Hashing

    /*
    public static void computeCharFrequencies(char[] arr, int[] hash) {
        for (int i = 0; i < arr.length; i++) {                                //using array    TC = O(n+q)
           hash[arr[i]-'a'] += 1;         }
    }




    public static void computeCharFrequencies1(String s, int[] hash) {
        for (int i = 0; i < s.length(); i++) {                                      //using string
            hash[s.charAt(i)-'a'] += 1;         }
    }






    public static void handleCharQueries(int[] hash, Scanner sc) {
        int q = sc.nextInt();
        while (q-- > 0) {
            char ch = sc.next().charAt(0);
            System.out.println(hash[ch-'a']);                   // -'a" because (a) ka real value 97 hai but hmlg 26 tak hi lia hai to isme prblem hoga so humlg  -a  kiya such that [a -a] = 97-97 = 0  matlab ki a directly 0 me store ho jaye and z b 26 tk ho hi jyga --
        }
    }
    */


}
