package Demo10;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);
        Member one = new Member("成员a",0);
        Member two = new Member("成员b",0);
        Member three = new Member("成员c",0);
        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("===============");
        ArrayList<Integer>redList = manager.send(30,3);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);
        manager.show();
        one.show();
        two.show();
        three.show();

    }
}
