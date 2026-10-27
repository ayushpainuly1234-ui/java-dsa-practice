import java.util.Scanner;
public class marks{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        if(n>90){
            System.out.print("Very good :");
        }
        else if(n>80){
             System.out.print(" good :");

        }
        else if(n>70){
             System.out.print("medium :");
        }
        else if(n>60){
            System.out.print("Average :");

        }
        else {
             System.out.print("fail :");
        
        }


    }

}