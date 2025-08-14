public class Patterns {
    public static void main(String[] args) {
      // pattern1(5);
      //  pattern2(5);
      //  pattern3(5);
      //  pattern4(5);
       // pattern5(5);
      //  pattern6(5);
       // pattern7(5);
       //pattern8(5);
       //pattern9(5);
        pattern10(5);

    }
    static void pattern1(int N)
    {
        for (int i =0;i<N;i++)
        {
            for (int j=0;j<N;j++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*   ***
         ***
         ***
     */
    static void pattern2(int N)
    {
        for (int i =0;i<N;i++)
        {
            for (int j=0;j<i;j++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*   *
         **
         ***
     */
    static void pattern3(int N)
    {

        for (int i =1;i<N;i++)
        {
            for (int j=1;j<i;j++ )
            {
                System.out.print(j);
            }
            System.out.println(i);

        }
    }
    /*   1
         12
         123
         1234
     */
    static void pattern4(int N)
    {

        for (int i =1;i<N;i++)
        {
            for (int j=1;j<i;j++ )
            {
                System.out.print(i);
            }
            System.out.println(i);

        }
    }
    /*
    1
    22
    333
    4444
     */
    static void pattern5(int N) {

        /*for (int i = N; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();

        }*/
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= N - i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    static void pattern6(int N)
    {

        for (int i =N;i>=0;i--)
        {
            for (int j=1;j<i;j++ )
            {
                System.out.print(j);
            }
            System.out.println();

        }
    }

    static void pattern7(int N)
    {
        for (int i = 0;i<N;i++)
        {
            for (int j=0;j<N-i-1;j++ )
            {
                System.out.print(" ");
            }

            for (int j=0;j<(2*i+1);j++ )
            {
                System.out.print("*");
            }


            System.out.println();

        }
    }
    static void pattern8(int N)
    {
        for (int i = 0;i<N;i++)
        {
            for (int j=0;j<i;j++ )
            {
                System.out.print(" ");
            }

            for (int j = 0; j <2*N-(2*i+1); j++) {  //2*(N-i)-1 main thing in this pattern
                System.out.print("*");
            }





            System.out.println();

        }
    }
    static void pattern9(int N) {
        for (int i = 0; i < N; i++)
        {
            for (int j=0;j<N-i-1;j++ )
            {
                System.out.print(" ");
            }

            for (int j=0;j<(2*i+1);j++ )
            {
                System.out.print("*");
            }





            System.out.println();

        }
        for (int i = 0; i < N; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * N - (2 * i + 1); j++) {  //2*(N-i)-1 main thing in this pattern
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern10(int N)
    {
        for (int i =0;i<N;i++)
        {
            for (int j=0;j<=i;j++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <N; i++) {
            for (int j = 0; j <N - i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }






}
