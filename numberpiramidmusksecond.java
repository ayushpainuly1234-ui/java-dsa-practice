import java.util.Scanner;
public class numberpiramidmusksecond{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
          System.out.print("Enter a number ");
          int n=sc.nextInt();
          int nsp = 1;
          int nst=n;
          int a =1; 
          for(int i=1;i<=2*n+1;i++){
            System.out.print(a+"  ");
           a++;
           
          }
          System.out.println();
          for(int i=1;i<=n;i++){
            for(int j=1;j<=nst;j++){
                System.out.print(a+" ");
                a++;
            }
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
                a++;
            }
            for(int j=1;j<=nst;j++){
                System.out.print(a+"  ");
                a++;
            }
            System.out.println();
            nst--;
            nsp+=2;
          }
    }
}