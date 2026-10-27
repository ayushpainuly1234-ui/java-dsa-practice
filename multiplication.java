import java.util.Scanner;
public class multiplication{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row :");
        int r = sc.nextInt();
        System.out.print("Enter a column :");
        int c= sc.nextInt();
        System.out.print("Enter a second matrix row :");
        int p=sc.nextInt();
        System.out.print("Enter a second matrix column :");
        int q= sc.nextInt();
        int[][] a=new int[r][c];
        System.out.println("Enter a elements of the array :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter a elements of the second matrix :");
        int[][] b=new int[p][q];
         for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                b[i][j]=sc.nextInt();
            }
         }
          int[][] res=new int[r][q];
      
         if(c!=p){
            System.out.print("multiplication is not possible :");
         }
        else{
            int cr=c;
            for(int i=0;i<r;i++){
            for(int j=0;j<q;j++){
                 res[i][j]=0;
                 for(int k=0;k<cr;k++){
                    res[i][j]+=a[i][k]*b[k][j];
                 }

             
                

            }
         }
         System.out.println("THE OUTPUT IS  A :"); 
         for(int i=0;i<r;i++){
            for(int j=0;j<q;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
         }
        }


    sc.close();
    }
}