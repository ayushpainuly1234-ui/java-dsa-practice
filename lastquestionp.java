import java.util.Scanner;
public class lastquestionp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n=sc.nextInt();
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=2*n-1;j++){
                int a =i;
                if(i>n){
                    a=2*n-i;
                } 
                int b=j;
                if(j>n){
                    b=2*n-j;
                }
               // int max=n+1;
                if(a<b){
                    int max = n+1-a;
                    System.out.print(max+" ");
                }
                
                else{
                    int max=n+1-b;
                    System.out.print(max+" ");
                }
                

            }
            System.out.println();
        }
        sc.close();
    }

}