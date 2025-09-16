public class Print1ToNUsingRecursion {
    public static void main(String[] args) {
        printNumbers(1,4);// start endine hum deke print kara skta hai
        printNumbers1(4);

    }
    public static void printNumbers(int i ,int n ) {

        if(i<=n){
            System.out.println(i);
            i++;

            printNumbers(i,n);
        }
    }
    public static void printNumbers1(int n ){
        if(n>0)
        {
            printNumbers1(n-1);
            System.out.println(n);
        }
    }
}
