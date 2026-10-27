import java.util.Scanner;
public class sumevenodd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of this array :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter a array elements :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int evensum=0;
        int oddsum=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                evensum+=arr[i];

            }
            else{
                oddsum+=arr[i];
            }
            
        }
        int total = evensum-oddsum;
        System.out.print("the total is the :"+total+" ");


        
    }
}