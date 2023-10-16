package lecture06;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercize6_23 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        ArrayList al = new ArrayList<Integer>();
        for (int i=0;i<6;i++){
            al.add(random.nextInt(6)+1);
        }
        //int[] integer = new int[]{random.nextInt(6) + 1, random.nextInt(6) + 1, random.nextInt(6) + 1, random.nextInt(6) + 1, random.nextInt(6) + 1};
        System.out.println("何番目のさいころの値を確認しますか。");
        //try {
            int index = input.nextInt();
            //System.out.println(integer[index]);
        //}catch (InputMismatchException e){
        //    System.out.println("整数以外の値が入力されました。");
        //}
        try{
            System.out.println();
        }catch(IndexOutOfBoundsException e){
            System.out.println("ArrayListの範囲外アクセスを確認しました。");
        }
    }
}
