import java.util.Scanner;
public class ncrnprfun{
    public static int fun(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
         
        }
           return f;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a n :");
        int n=sc.nextInt();
        System.out.print("Enter a r :");
        int r =sc.nextInt();
        int nfect=fun(n);
        int rfect=fun(r);
        int cfect=fun(n-r);
        int ncr=nfect/rfect*cfect;
        System.out.print("The ncr is a "+ncr);
        sc.close();
    }
}