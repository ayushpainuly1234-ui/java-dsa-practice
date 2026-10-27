import java.util.Scanner;
public class ncrandnpr{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a n :");
        int n= sc.nextInt();
        System.out.print("Enter a r :");
        int r=sc.nextInt();
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        int f2=1;
        for(int i=1;i<=r;i++){
            f2*=i;
        }
        int f3=1;
        for(int i=1;i<=n-r;i++){
            f3*=i;
        }
        int ncr=f/(f2*f3);
        System.out.println("the answer is "+ncr);
        
    }
}