import java.util.Scanner;
public class profitloss{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a selling price :");
     int sp = sc.nextInt();
     System.out.print("Enter a cost price :");
     int cp = sc.nextInt();
     if(cp<sp){
        System.out.print("profit :");
        int p = sp-cp;
        System.out.print(p);

     }
else{
System.out.print("Loss :");
int L=cp-sp;
  System.out.print(L);
}
if(cp==sp){
    System.out.print("No profit and no loss :");
}

    }

}
