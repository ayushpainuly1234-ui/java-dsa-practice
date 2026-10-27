import java.util.Scanner;
public class circle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter circle center (x,y) :");
    int x = sc.nextInt();
    int y =sc.nextInt(); 
    System.out.print("Enter a outside circle (x1,y1) :");
    int x1=sc.nextInt();
    int y1=sc.nextInt();
    System.out.print("Enter a radius :");
    int radius = sc.nextInt();
        double distance =Math.sqrt((x1-x)*(x1-x))+((y1-y)*(y1-y));
        System.out.println(distance);
        if(distance<radius){
            System.out.print("Inside the circle :");
        }
        else if(distance == radius){
            System.out.print("On the circle :");
        }
        else{
            System.out.print("Out side the circle :");
        }

sc.close();

    }
   
}