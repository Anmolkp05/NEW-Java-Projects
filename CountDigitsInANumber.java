import static java.lang.Math.log10;

public class CountDigitsInANumber {
    public static void main(String[] args) {

        System.out.println(count( 1234));
        System.out.println(count1( 1234));
    }
    public static int count(int  n){
        int count =0;
        if (n==0){
            count = 1;}
        else{
            while (n!=0){
                n = n/10;              //jitna bar 10 se divisible hoga utna bar count barhega so niche me formula hai ushe drctly b nikal skta hai by using log
                count++;
            }
        }
        return count;
    }
    public static int count1(int  n){
        int Count = (int)log10(n) + 1;    //log10(n)  is formula se answer ata hai but answer with some integers values like 4.58474 rehta hai so humlog usko integer me kr deta h so the  integer part (4) will be our answer
        return Count;                       //TC = O(log10(N))  jab bhi division rehta hai with some number then TC log me ata hai like 2 se divisible rhga to log2   yha 10 se tha islie log10 hai
    }

}
