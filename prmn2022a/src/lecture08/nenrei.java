package lecture08;

public class nenrei {
    private int value;
    public nenrei(int value){
        if(value>=0&&value<=120) {
            this.value = value;
            return;
        }
        throw new RuntimeException(value+"は人間じゃない");
    }

    public boolean check(){
        return value>=20;
    }

    public int getValue(){
        return value;
    }
}
