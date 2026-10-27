import java.util.Scanner;
public class pascal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a n :");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" "+" ");
                
            }
            for(int j=0;j<=i;j++){
                System.out.print(fun(i)/(fun(j)*fun(i-j))+"   ");
            }
            System.out.println();
        } 
    }
    public static int fun(int a){
        int f=1;
        for(int i=1;i<=a;i++){
            f*=i;
        }
        return f;
    }
}