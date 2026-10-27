import java.util.Scanner;
public class productzeroskip{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number :");
    int n=sc.nextInt();
    int sum =1;
    while(n!=0){
      
            int ld=n%10;
              if(ld==0){
            n=n/10;
            continue;
         }
           
           sum = ld*sum;
           n=n/10;
        
    }
        System.out.print(sum+" ");
    }
}