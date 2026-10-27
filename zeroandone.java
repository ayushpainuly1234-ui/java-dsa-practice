import java.util.Scanner;
public class zeroandone{
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
        int idx=0;
        int maxcount=0;
        for(int i=0;i<r;i++){
            int count=0;
            for(int j=0;j<c;j++){
                if(arr[i][j]==2){
                count++;
                }
                if(maxcount<count){
                    maxcount=count;
                     idx=i;
                }
               

            }
        }

        System.out.println(maxcount +" ");
        System.out.println(idx +" ");
    }
}