package DouDiZhu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Dou {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        String [] color = {"♥","♣","♠","♦"};
        String [] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K",};
        poker.add("大王");
        poker.add("小王");
        for(String number : num){
            for (String colors : color) {
                //System.out.println(colors+number);
                poker.add(colors+number);
            }
        }
        //System.out.println(poker);
        Collections.shuffle(poker);
        //System.out.println(poker);
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();
         for (int i = 0; i <poker.size() ; i++) {
            String p = poker.get(i);
            if(i >=51){
                diPai.add(p);
            }else if(i % 3 ==0){
                player1.add(p);
            }else if(i % 3 == 1){
                player2.add(p);
            }else if(i % 3 == 2){
                player3.add(p);
            }
        }
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(diPai);

    }
}
