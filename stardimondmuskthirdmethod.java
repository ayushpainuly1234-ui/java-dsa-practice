import java.util.Scanner;
public class stardimondmuskthirdmethod{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n= sc.nextInt();
        int nsp=n-1;
        int nst =1;
        int ml=n/2+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print(j+" ");
            }
            
            if(i<ml){
                nst+=2;
                nsp--;
            }
            else{
                nsp+=1;
                nst-=2;
            }
            System.out.println();
        }
        sc.close();
    }
}