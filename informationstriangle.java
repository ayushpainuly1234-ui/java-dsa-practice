import java.util.Scanner;
public class informationstriangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
       // int a =1;
        for(int i=1;i<=n;i++){
           int a =1;
            for(int j=1;j<=i;j++){
              //  System.out.print((char)(i+64)+" ");
                 System.out.print(a+" ");
                a+=2;
               // if(a<10) System.out.print("  ");
             //  System.out.print((2*j-1)+" ");
                
            }
            System.out.println();
        }



    }
}