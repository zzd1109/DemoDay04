package Demo10;

import java.util.ArrayList;

public class Manager extends User{
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }
    public ArrayList<Integer> send(int totalMoney,int count){
        int selfMoney = super.getMoney();
        ArrayList<Integer> redlist = new ArrayList<>();
        if(totalMoney > selfMoney){
            System.out.println("余额不足！");
            return redlist;
        }
        super.setMoney(selfMoney - totalMoney);
        int avg = totalMoney / count;
        int mod = totalMoney % count;
        for (int i = 0; i < count-1; i++) {
            redlist.add(avg);
        }
        int last = avg + mod;
        redlist.add(last);
        return redlist;

    }
}
