import java.util.Scanner;
public class greatestnumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number :");
        int a=sc.nextInt();
        System.out.print("Enter a second number :");
        int b=sc.nextInt();
        System.out.print("Enter a third number :");
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.print(a+" is a gretest number  ");

        }
       else if(b>a && b>c){
            System.out.print(b+ " is a gretest number  ");

        }
        else{
            System.out.print(c+ " is a gretest number  ");

    }
    }


    
}
