import java.util.Scanner;
public class remendar{
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     System.out.print("Enter a first elements :");
     int x = sc.nextInt();
     System.out.print("Enter a second elements :");
     int y = sc.nextInt();
    //  int p=x/y;
    //  int  remendar = x-(p*y);
    int remendar = x%y;
     System.out.println("the out put is "+remendar);

    }

    
}

