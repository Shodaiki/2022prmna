package lecture03;
import  java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("何行分入力しますか？:");
        int a=input.nextInt();
        String[] str=new String[a];
        for(int i=1;i<=a;i++){
            Scanner sc=new Scanner(System.in);

            System.out.println(i+"行目:");
            str[i-1]=sc.nextLine();
        }
        for(int j=0;j<a;j++){
            System.out.println("["+j+"] "+str[j]);
        }
    }
}
