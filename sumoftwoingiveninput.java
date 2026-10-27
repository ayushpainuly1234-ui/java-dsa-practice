import java.util.Scanner;
public class sumoftwoingiveninput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of total :");
        int x=sc.nextInt();
        System.out.print("Enter a array size :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter a element of the array :");
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==x){
                    count++;
                    System.out.println("(" +arr[i] + "," +arr[j] +")");
        
                }
              

            }
        }
        System.out.print("the total number sum this is a "+count);
        
        
    }
}