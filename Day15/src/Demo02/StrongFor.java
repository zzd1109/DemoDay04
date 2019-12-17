package Demo02;

import java.util.ArrayList;
import java.util.Collection;

public class StrongFor {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("姚明");
        coll.add("科比");
        coll.add("麦迪");
        coll.add("詹姆斯");
        coll.add("艾弗森");
        for (String i : coll){
            System.out.println(i);
        }

    }
}
