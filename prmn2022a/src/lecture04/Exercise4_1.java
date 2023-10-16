package lecture04;

public class Exercise4_1 {
    public static void main(String[] args) {
        Fighter f1=new Fighter(150,50,"Taro");
        Fighter f2=new Fighter(200,70,"Masao");
        while(true) {
            f1.attack(f2);
            if(!f1.isAlive()){
                System.out.println(f1.getName()+"は倒れた。");
                break;
            }
            f2.attack(f1);
            if(!f2.isAlive()){
                System.out.println(f2.getName()+"は倒れた。");
                break;
            }
        }
    }
}
