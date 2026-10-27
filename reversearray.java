import java.util.Scanner;
public class reversearray{
       
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
          System.out.print("Enter a number :");
        int n= sc.nextInt();
       
        int[] arr=new int[n];
        System.out.print("Enter a elements of this array :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        fun(arr,2,n-1);
       for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        }
    public static void fun(int arr[] ,int a,int b){
        int i=a;
        int j=b;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
      
    }

}