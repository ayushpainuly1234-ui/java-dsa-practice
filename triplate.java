import java.util.Scanner;
public class triplate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x=12;
        System.out.print("Enter a array size :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter a array elements :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        int totaltriplate=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==x){
                         totaltriplate++;
                        System.out.println("(" +arr[i] +"," +arr[j] +"," +arr[k]+")");
                    }

                }
            }
            
        }
        System.out.print(totaltriplate);







    }
}