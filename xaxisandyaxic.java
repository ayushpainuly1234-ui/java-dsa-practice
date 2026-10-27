import java.util.Scanner;
public class xaxisandyaxic{
    /**
     * @param args
     */
    public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a first line :");
  int x = sc.nextInt();
  System.out.print("Enter a second line :");
  int y = sc.nextInt();
  if(x==0  && y==0){
    System.out.print("the point is orgin :");

  }
  else if(x==0){
    System.out.print("The point is y Axic");
  }
  else if(y==0){
    System.out.print("The point is x axic");
  }
  else
  System.out.print("no orgin no x->axic and no y->axic");


}

}
