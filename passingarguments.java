import java.util.Scanner;
public class passingarguments{
    public static void call(String name){
        System.out.println("good morning "+name);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        call("ujjwal painuly");
    }
}