package lecture02;

public class human {
    String name;
    int age;
    human(String name,int age){
        this.name=name;
        this.age=age;
    }

    void print() {
        if (age <= 18 && age > 0) {
            System.out.println("生徒:"+name + " " + age + "歳です。");
        } else if (age <= 22 && age > 18) {
            System.out.println("学生:"+name + " " + age + "歳です。");
        } else {
            System.out.println("error");
        }
    }
    }

