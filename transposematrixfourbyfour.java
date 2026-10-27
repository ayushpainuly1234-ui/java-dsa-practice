import java.util.Scanner;
public class transposematrixfourbyfour{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter a row :");
        int r=sc.nextInt();
        System.out.print("Enter a column :");
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter a elements of this array a :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("THE OUTPUT IS A  :");
        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        //printing
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}