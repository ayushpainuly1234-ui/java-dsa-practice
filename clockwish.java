import java.util.Scanner;
public class clockwish{
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
        for(int i=0;i<r;i++){
            for(int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0,k=c-1;j<k;j++,k--){
                int temp=arr[i][j];
                arr[i][j]=arr[i][k];
                arr[i][k]=temp;

            }
        }
        System.out.println();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}