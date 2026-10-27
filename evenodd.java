import java.util.Scanner;
public class evenodd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first elements :");
        int x = sc.nextInt();
        if(x%2==0){
            System.out.print( "this is a even number");

        }
        else{
            System.out.print( "this is a odd number "+x);

        }




    }


}