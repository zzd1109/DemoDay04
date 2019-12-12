package Demo10;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }
    public void receive(ArrayList<Integer> list){
        Random r = new Random();
        int num = r.nextInt(list.size());
        int delta = list.remove(num);
        int money = super.getMoney();
        super.setMoney(money + delta);


    }
}
