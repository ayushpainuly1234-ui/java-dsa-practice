import java.util.Scanner;
public class absolutevalue{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number :");
    int n=sc.nextInt();
   // System.out.print(n);
    if(n<0){
        n=n*(-1);
        System.out.print( "the absolute value is " +n);

    }
    else
    System.out.print("the absolute value is " +n);

    }
}