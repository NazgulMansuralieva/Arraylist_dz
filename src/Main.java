import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random=new Random();
        for (int i = 0; i < 50; i++) {
           list.add(random.nextInt(100));
        }
       ArrayList<Integer>list2=new ArrayList<>();
        ArrayList<Integer>list3=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int x=list.get(i);
            if(x%2==0){
               list2.add(x);
            }else{
                list3.add(x);
            }
        }System.out.println(list2);
        System.out.println(list3);

    }
}