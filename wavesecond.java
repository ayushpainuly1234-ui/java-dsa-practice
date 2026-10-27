import java.util.Scanner;
public class wavesecond{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      System.out.print("Enter a size of the array :");
      int n= sc.nextInt();
      System.out.println("Enter a elements of this array :");
         int[][] arr=new int[n][n];
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
         }
         System.out.println("::::THE OUT PUT IS A ::::");spira
           for(int j=0;j<n;j++){
            if(j%2==0){
                for(int i=n-1;i>=0;i--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int i=0;i<n;i++){
                    System.out.print(arr[i][j]+" ");
                }
               
            }
            System.out.println();
  
}
sc.close();
    }
}
