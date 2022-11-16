package lecture03;

import java.util.ArrayList;

public class Exercise3_4 {
    public static void main(String[] args) {
        ArrayList<Vegetable> vegetable=new ArrayList<>();
        vegetable.add(new Vegetable("にんじん",117));
        vegetable.add(new Vegetable("たまねぎ",120));
        vegetable.add(new Vegetable("じゃがいも",154));

        for(int i=0;i<vegetable.size();i++){
            vegetable.get(i).print();
        }
    }
}
