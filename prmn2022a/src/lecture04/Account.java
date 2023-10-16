package lecture04;

import javax.lang.model.element.Name;

public class Account {
    String name;
    String number;
    long balance;

    public Account(String name,String number){
        this.name=name;
        this.number=number;
        this.balance=0;
    }

    String getNumber(){
        return number;
    }

    String getName(){
        return name;
    }

    long getBalance(){
        return balance;
    }

    void setBalance(long balance){
        this.balance=balance;
    }
}
