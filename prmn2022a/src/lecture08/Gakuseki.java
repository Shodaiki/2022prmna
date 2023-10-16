package lecture08;

public class Gakuseki {
    private String value;

    public Gakuseki(String value){
        String kashira=value.substring(0,1);
        String number=value.substring(1,8);
        if(kashira.equals("b") && number.length()==7){
            this.value=value;
            return;
        }
        throw new RuntimeException(value+"は学籍じゃない");
    }

    public String getValue(){
        return value;
    }
}
