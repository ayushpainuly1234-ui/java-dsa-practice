import java.util.Scanner;
public class triangle{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a first side of a triangle :");
      int a=sc.nextInt();
     System.out.print("Enter a second side of a triangle :");
      int b=sc.nextInt();
    System.out.print("Enter a third side of a triangle :");
      int c=sc.nextInt();
      if(a+b>c  &&  b+c>a && c+a>b){
        System.out.print("Yes this is a triangle :");
      }
      else{
        System.out.print("This is a not a triangle :");
      }
     
    }
}