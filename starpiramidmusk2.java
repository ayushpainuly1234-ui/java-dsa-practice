import java.util.Scanner;
public class starpiramidmusk2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int n=sc.nextInt();
        int nsp=n-1;
        int nst=1;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            
          int a=i-1;
            for(int j=1;j<=nst;j++){
                System.out.print((char)(j+64)+" ");
                
            }
            for(int k=1;k<=nst-1;k++){
                System.out.print((char)(a+64)+" ");
                 a--;
            }
            
            System.out.println();
            nsp--;
            nst+=1;
        }
        
    }

}