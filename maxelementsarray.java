import java.util.Scanner;
public class maxelementsarray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a array size :");
        int n=sc.nextInt();
        int[] arr= new int[n];
         System.out.println("Enter a array elements :");
        for(int i=0;i<n;i++){
          //  System.out.print("Enter a array elements :");
            arr[i]=sc.nextInt();
        }
        int max = arr[0];
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.print("the max element is "+max);
        sc.close();
    }
}