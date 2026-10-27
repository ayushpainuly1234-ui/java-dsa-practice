import java.util.Scanner;
public class divisible{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int x =sc.nextInt();
        if(x%3==0 && x%5==0){
            if(x%15!=0){
                System.out.print("divisible by 3 or 5 but or not a divisible by 15 :");
            }
            else{
            System.out.print("coundition not a requared :");
            }
           

        }
        else{
             System.out.print(" not maching a requared coundition :");

        }



    }
    }
