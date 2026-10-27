import java.util.Scanner;
public class stardimond{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        int nst =1;
        int nsp=n-1;
        for(int i=1;i<=n;i++){
           // int a =i-1;
            for(int j=1;j<=nsp;j++){
                System.out.print(" "+" ");

            }
            for(int j=1;j<=nst;j++){
                System.out.print(j+" ");
            }
           // for(int k=1;k<=nst-1;k++){
             //   System.out.print(a+" ");
              //  a--;
           // }
            System.out.println();
            nst+=2;
            nsp--;

        }
            nsp=1;
            nst=2*n-3;
        for(int i=n;i>=1;i--){
          // int a=i-1;
            for(int j=1;j<=nsp;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print(j+" ");
            }
          
            
            System.out.println();
            nsp+=1;
            nst-=2;
            
        }
    }
}