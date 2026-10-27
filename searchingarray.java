import java.util.Scanner;
public class searchingarray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       // int arr[10]={1,2,3,1,5,4,5,8,9,12};
       System.out.print("Enter a size of this array :");
       int n=sc.nextInt();
       int[] arr=new int[n];
       System.out.print("Enter a elements of this array :");
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
      //  boolean flag= false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                 //   flag =true;
                    System.out.println(arr[i]+" is the duplicate elements and the index is a "+i);
                  
                }

            }
              
        }
        sc.close();
    }
}