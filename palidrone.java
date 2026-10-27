import java.util.Scanner;
public class palidrone{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number :");
       int n=sc.nextInt();
       int nst=n;
       int nsp=1;
     
       for(int i=1;i<=2*n+1;i++){
        int b=i;
        if(b>n){
         b=2*n-i;
        }
        
        System.out.print(b+" ");
       }
        System.out.println();
       for(int i=1;i<=n;i++){
        for(int j=1;j<=nst;j++){
            System.out.print(j+" ");
        }
        for(int j=1;j<=nsp;j++){
            System.out.print("  ");
        }
        int a =3;
        for(int j=1;j<=nst;j++){
            System.out.print(a+" ");
            a--;
        }
        System.out.println();
        nst--;
        nsp+=2;
       }
       sc.close();

    }

}