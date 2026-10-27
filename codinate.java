import java.util.Scanner;
public class codinate{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         double x1=sc.nextDouble();
         double x2=sc.nextDouble();
         double x3=sc.nextDouble();
         double y1=sc.nextDouble();
         double y2=sc.nextDouble();
         double y3=sc.nextDouble();
         double m1=(y2-y1)/(x2-x1);
         double m2=(x3-x2)/(y3-y2);
if(m1==m2){
    System.out.print("The three points lie is the single line :");
}
else{
    System.out.print("the three points lie is not the single line :");
}
    }

}