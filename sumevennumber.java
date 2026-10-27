import java.util.Scanner;
public class sumevennumber{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number :");
    int n = sc.nextInt();
    int sum=0;
    while(n>0){
       
            int ld=n%10;
            if(ld%2==0){
            sum= ld+sum;
          
            }
              n=n/10;
        
    }
    System.out.print(sum+" ");
    }
}