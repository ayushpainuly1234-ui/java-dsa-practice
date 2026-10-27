import java.util.Scanner;
public class solidsquare{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a raw :");
        int r=sc.nextInt();
        System.out.print("Enter a column :");
        int c = sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    
    }
}