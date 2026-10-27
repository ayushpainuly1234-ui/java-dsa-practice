import java.util.Scanner;
public class reversewithmultiple{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a length of this array :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter a elements of this array :");
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
            
        }
        System.out.print("Enter a second time reverse of this array :");
        int k=sc.nextInt();
        k=k%n;
        REV(arr,0,n-1);
        REV(arr,0,k-1);
        REV(arr,k,n-1);
        for(int i=0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }
       
    }
    public static void REV(int arr[],int a,int b){
        int i=a;
        int j=b;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
     
    }

}