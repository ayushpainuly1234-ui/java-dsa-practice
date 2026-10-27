import java.util.Scanner;
public class maxnumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a raw :");
        int r= sc.nextInt();
        System.out.print("Enter a column :");
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter a elements of this array :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
       int maxsum=0;
        for(int i=0;i<r;i++){
           int sum=0;
            for(int j=0;j<c;j++){
                sum+=arr[i][j];
                 if(maxsum<sum){
                    maxsum=sum;
                 }
            } 
        }
          System.out.print(maxsum);
          sc.close();
         
    }
}