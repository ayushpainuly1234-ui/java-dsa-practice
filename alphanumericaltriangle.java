import java.util.Scanner;
public class alphanumericaltriangle{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number :");
    int n =sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
            else{
                System.out.print((char)(i+64)+" ");
            }
        }
        System.out.println();
      
    }
      sc.close();
}



}