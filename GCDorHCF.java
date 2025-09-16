import static java.lang.Math.min;

public class GCDorHCF {
    public static void main(String[] args) {
        System.out.println(GCD(12,15));
        System.out.println(GCD1(12,15));
        System.out.println(GCD2(12,15));

    }
    public static int GCD(int n1, int n2 ){

        for(int i =min(n1,n2);i>=1;i--){
            if(n1%i==0 && n2%i==0){
                return i;
                                  //TC = O(min(n1,n2)

            }
        }
        return 0;
    }


    // Euclidean/Euclid's Algorithm = gcd(n1,n2) = gcd(a-b,b) where n1>n2
    //eg - n1 =10 n2 = 5
    // gcd(10,5) = gcd(10-5,5) = gcd(5,5) -> gcd(5-5,5) = gcd(0,5) -> so conclusion here the gcd of this is 5 --- the number leaving zero is the gcd always ..

    public static int GCD1(int n1, int n2){          //TC = O(log[Φ]m(n1,n2))  --->[Φ]phi just bcz we dont know exactly what will be the value ..it depends so we have chose it
                                                    // Modified Euclidean Algorithm
        while (n1>0 && n2>0){
            if(n1>n2){
                n1 = n1%n2;             // gcd(n1,n2)= gcd(n1%n2,n2) where n1<n2
                                        // wese me minus minus hote jata hai bara numbers ke liye jada time and iterate karna hoga so usme bhi yahi kam ho rha th to yha easily kar dia such that ek hi bar me ho and easily ho

            }else{
                n2 = n2%n1;

            }
        }
        if(n1==0){
            return n2;
        }else{
            return n1;
        }
    }
    public static int GCD2(int n1, int n2){          //TC = O(log[Φ]m(n1,n2))  --->[Φ]phi just bcz we dont know exactly what will be the value ..it depends so we have chose it

        while (n1>0 && n2>0){
            if(n1>n2){
                n1 = n1-n2;             // gcd(n1,n2)= gcd(n1-n2,n2) where n1<n2

            }else{
                n2 = n2-n1;

            }
        }
        if(n1==0){
            return n2;
        }else{
            return n1;
        }
    }
}
