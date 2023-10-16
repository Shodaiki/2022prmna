package lecture05;
import java.util.ArrayList;
import java.util.List;

public class Exercise5_7 {
    public static void main(String[] args) {
        Insect[] lists={new Insect(),new Butterfly(),new Locust(),new SwallowtailButterfly()};
        for (Insect list : lists) {
            list.move();
        }
    }
}
