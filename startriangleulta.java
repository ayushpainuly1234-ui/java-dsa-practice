import java.util.Scanner;
public class startriangleulta{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row & column :");
        int n = sc.nextInt();
        int m= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}