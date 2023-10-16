package lecture04;

public class Fighter {
    private int hitPoint;
    private int power;
    private String name;

    public Fighter(int hitPoint,int power,String name){
        this.hitPoint=hitPoint;
        this.power=power;
        this.name=name;
    }

    public void attack(Fighter enemy){
        hitPoint=hitPoint- enemy.power;
        System.out.println(enemy.name+"は"+name+"に"+enemy.power+"ダメージ与えた");
        System.out.println(name+"の残りhitPoint:"+hitPoint);
    }

    public boolean isAlive(){
        return hitPoint>0;
    }

    public int getHitPoint(){
        return hitPoint;
    }

    public void setHitPoint(int hitPoint){
        this.hitPoint=hitPoint;
    }

    public String getName(){
        return  name;
    }

}
