import java.util.Scanner;
public class fector{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        int hf=0;
       for(int i=n-1;i>1;i--){
            if(n%i==0){ 
               hf = i;
               break;
            }
            }
            
          System.out.println("the hightest fector is "+hf);
           sc.close();
    }
}