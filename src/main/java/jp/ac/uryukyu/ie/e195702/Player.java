package jp.ac.uryukyu.ie.e195702;

import java.util.ArrayList;


public class Player {
    public void player(){
        ArrayList<String> Player_1 = new ArrayList<>();//プレイヤーの手札となるリスト
        ArrayList<String> Player_2 = new ArrayList<>();//プレイヤーの手札となるリスト
        ArrayList<String> Player_3 = new ArrayList<>();//プレイヤーの手札となるリスト
        ArrayList<String> Player_4 = new ArrayList<>();//プレイヤーの手札となるリスト


        Card Draw = new Card();
        ArrayList<String> draw = new ArrayList<>(Draw.cards());


        int i=0;
        while (i <= 53) {
            if (i == 53) {
                break;
            } else {
                String word1 = draw.get(i);
                Player_1.add(word1);
                i++;
                if (i == 53) {
                    break;
                } else {
                    String word2 = draw.get(i);
                    Player_2.add(word2);
                    i++;
                    if (i == 53) {
                        break;
                    } else {
                        String word3 = draw.get(i);
                        Player_3.add(word3);
                        i++;
                        if (i == 53) {
                            break;
                        } else {
                            String word4 = draw.get(i);
                            Player_4.add(word4);
                            i++;
                        }
                    }
                }
            }
        }
        System.out.println("Player_1 =" + Player_1);
        System.out.println("Player_2 =" + Player_2);
        System.out.println("Player_3 =" + Player_3);
        System.out.println("Player_4 =" + Player_4);


    }
}

