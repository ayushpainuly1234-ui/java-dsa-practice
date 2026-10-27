import java.util.Scanner;
public class power{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of square :");
        int a = sc.nextInt();
        System.out.print("Enter a power :");
        int b= sc.nextInt();
        int ans=1;
        for(int i=1;i<=b;i++){
            ans*=a;
        }
        System.out.print("the power is "+ans);


    }

}