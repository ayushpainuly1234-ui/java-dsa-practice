import java.util.Scanner;
public class spiral{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
          System.out.print("Enter a row :");
        int r = sc.nextInt();
        System.out.print("Enter a column :");
        int c= sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter a elements of the array :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(":::::::::::::::::::::");  
        int minr=0;
        int maxr=r-1;
        int minc=0;
        int maxc=c-1;
        int TNE=r*c;
        int count=0;
        while(count<TNE){
            for(int j=minc;j<=maxc && count<TNE;j++){
                System.out.print(arr[minr][j]+" ");
                count++;
            }
            minr++;
            for(int i=minr;i<=maxr && count<TNE;i++){
                System.out.print(arr[i][maxc]+" ");
                count++;
            }
            maxc--;
            for(int j=maxc;j>=minc && count<TNE;j--){
                System.out.print(arr[maxr][j]+" ");
                count++;
            }
            maxr--;
            for(int i=maxr;i>=minr && count<TNE;i--){
                System.out.print(arr[i][minc]+" ");
                count++;
            }
            minc++;
          System.out.println();
        }
        sc.close();
    }
}