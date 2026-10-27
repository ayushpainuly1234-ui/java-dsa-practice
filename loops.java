import java.util.Scanner;
public class loops{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int n=sc.nextInt();
        int a =2;
        int d =2;
        for(int i=1;i<=n;i++){
          
            System.out.println(a+" ");
            a=a*d;
            
        }
    }
}