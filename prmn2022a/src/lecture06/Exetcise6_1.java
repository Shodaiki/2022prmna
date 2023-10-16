package lecture06;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exetcise6_1 {
    public static void main(String[] args) {

        try{
            Scanner input = new Scanner(System.in);
            double d= input.nextDouble();
            System.out.println(d);
        }catch (InputMismatchException e){
            System.out.println("エラー");
        }
    }
}
