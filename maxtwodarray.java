import java.util.Scanner;
public class maxtwodarray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a rows :");
        int r=sc.nextInt();
        System.out.print("Enter a column :");
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter a elements of the array :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
                
            }
        }
        int max = arr[0][0];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(max<arr[i][j]){
                    max=arr[i][j];
                }

            }
        }
        System.out.print("THE MAX VALUE IS A 2D ARRAY :"+max);
        sc.close();
    }
}