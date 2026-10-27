import java.util.Scanner;
public class valueofoddeven{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] arr={1,2,3,4,5,6,7,8};
    for(int i=0;i<arr.length;i++){
        if(i%2!=0){
            arr[i]*=2;
        }
        else{
            arr[i]+=10;
        }
    }
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+" ");
    }
    sc.close();
  }
}