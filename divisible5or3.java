import java.util.Scanner;
public class divisible5or3{
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number :");
    int n;
    n=sc.nextInt();
    if(n%3==0  && n%5==0){
        System.out.print("Divisible by 3 and 5 ");

    }
    else
    System.out.print("not a divisible ");



   }
}
