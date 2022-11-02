package lecture01;

public class kadai05 {
    public static void main(String[] args) {
        int[] score={41,85,72,38,80};
        int max=Max(score);
        int min=Min(score);
        double ave=average(score);
        for(int i=0;i<score.length;i++){
            if(score[i]>=90){
                System.out.println(i+"番 "+score[i]+"点 秀");
            }
            else if(score[i]>=80){
                System.out.println(i+"番 "+score[i]+"点 優");
            }
            else if(score[i]>=70){
                System.out.println(i+"番 "+score[i]+"点 良");
            }
            else if(score[i]>=60){
                System.out.println(i+"番 "+score[i]+"点 可");
            }
            else{
                System.out.println(i+"番 "+score[i]+"点 不可");
            }
        }

        System.out.println("最高点:"+max+"点");
        System.out.println("最低点:"+min+"点");
        System.out.println("平均点:"+ave+"点");
    }
    static int Max(int[] array){
        int m=array[0];
        for(int i=0;i<array.length;i++){
            if(m<=array[i]){
                m=array[i];
            }
        }
        return m;
    }
    static int Min(int[] array){
        int mm=array[0];
        for(int i=0;i<array.length;i++){
            if(mm>=array[i]){
                mm=array[i];
            }
        }
        return mm;
    }
    static Double average(int[] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        double a=(double)sum/array.length;
        return a;
    }
}
