package jp.ac.uryukyu.ie.e195702;

import java.util.ArrayList;
import java.util.List;

public class Player {
    List<String> Player_1 = new ArrayList<String>();//プレイヤーの手札となるリスト
    List<String> Player_2 = new ArrayList<String>();//プレイヤーの手札となるリスト

    public void player() {

        Card Draw = new Card();
        ArrayList<String> draw = new ArrayList<>(Draw.cards());


        int i = 0;
        while (i <= 53) {
            if (i == 53) {
                break;
            } else {
                String word1 = draw.get(i);
                Player_1.add(word1);
                clearCards(Player_1);
                i++;
                if (i == 53) {
                    break;
                } else {
                    String word2 = draw.get(i);
                    Player_2.add(word2);
                    clearCards(Player_2);
                    i++;
                }
            }
        }
        System.out.println("1"+Player_1);
        System.out.println("2"+Player_2);

    }


    public List<String> clearCards(List<String> list) {

        int t = 0;

        out: while (true) {

            //リストの要素数が０、または最後の値まで検証し終わったらループを抜ける
            if (list.size() == 0 || t == list.size() - 1) {
                break;
            }

            String text = list.get(t);

            int j = t + 1;
            while (true) {

                //最後の値まで検証し終わったらループを抜ける
                if (j == list.size()) {
                    break;
                }

                String s = list.get(j);

                // 同一数値の要素を削除
                if (text.substring(1,2).equals(s.substring(1,2))) {

                    list.remove(j);
                    list.remove(t);
                    t = 0;

                    continue out;

                } else {
                    j++;
                }

            }

            t++;

        }

        return list;

    }
}
