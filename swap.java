import java.util.Scanner;
public class swap{
    public static void fun(int n, int m){
       int temp=n;
       n=m;
       m=temp;
      System.out.println(n+" "+m);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n= sc.nextInt();
        System.out.print("Enter a second number :");
        int m= sc.nextInt();
        System.out.println(n+" "+m);
        fun(n,m);
        System.out.println(n+" "+m);
        sc.close();
    
    }
}
