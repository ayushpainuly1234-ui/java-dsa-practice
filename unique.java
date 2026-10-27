import java.util.Scanner;
public class unique{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr={1,2,1,2,23,7};
       
        for(int i=0;i<arr.length;i++){
             boolean flag=false;
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i]==arr[j]){
                     flag=true;
                     break;

                }
            }
           if(flag==false){
           System.out.print(arr[i]+" ");
         // break;
             }
        }
       
    }
}