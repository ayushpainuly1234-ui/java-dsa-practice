import java.util.Scanner;
public class transposematrix{
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
       int[][] brr=new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
               brr[i][j]= arr[j][i];
            }
        }
        //printing
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();

        
    }
}