import java.util.Scanner;
public class areaperamiter{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a length :");
    int length = sc.nextInt();
    System.out.print("Enter a breadth :");
    int breadth = sc.nextInt();
    int area = length*breadth;
    int peramiter = 2*(length+breadth);
    if(area<peramiter){
        System.out.print("peramiter is gretter then area :");

    }
    if(peramiter<area){
        System.out.print("area is gretter then peramiter :");

    }
    if(area==peramiter){
        System.out.print("Equal :");

    }
    

    }
}