package lecture03;
import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("1つ目の整数を入力して下さい:");
        String a=input.nextLine();
        System.out.print("2つ目の整数を入力して下さい:");
        String b=input.nextLine();
        int aa=Integer.parseInt(a);
        int bb=Integer.parseInt(b);
        int ans=aa+bb;
        System.out.println(aa+"+"+bb+"="+ans);
    }
}
