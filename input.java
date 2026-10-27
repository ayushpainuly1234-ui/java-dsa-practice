import java.util.Scanner;
public class input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number :");
        int x = sc.nextInt();
        System.out.print("Enter a second number :");
        int y = sc.nextInt();
        int z = x+y;
        System.out.println("the two number sum is :" +z);
    }
   
}