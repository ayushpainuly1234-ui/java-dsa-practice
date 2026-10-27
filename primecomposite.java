import java.util.Scanner;
public class primecomposite{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
     System.out.print("Enter a number :");
     int n = sc.nextInt();
     boolean flag;
     flag = false;
     for(int i=2;i<n;i++){
          if(n%i==0){
            //System.out.print("composite number :");
          flag = true;
          }
     }
     if(n==1){
         System.out.print("no prime and no composite ");

     }

      else if(flag ==true){
        System.out.print("composite number ");
     }
     else{
     System.out.print("prime number ");
     }
    }
}