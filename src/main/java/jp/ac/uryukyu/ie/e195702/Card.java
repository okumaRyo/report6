package jp.ac.uryukyu.ie.e195702;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Card {
    ArrayList<String> spade = new ArrayList<>(Arrays.asList("S01","S02","S03","S04","S05","S06","S07","S08","S09","S10","S11","S12","S13"));
    ArrayList<String> heart = new ArrayList<>(Arrays.asList("H01","H02","H03","H04","H05","H06","H07","H08","H09","H10","H11","H12","H13"));
    ArrayList<String> clover = new ArrayList<>(Arrays.asList("C01","C02","C03","C04","C05","C06","C07","C08","C09","C10","C11","C12","C13"));
    ArrayList<String> diamond = new ArrayList<>(Arrays.asList("D01","D02","D03","D04","D05","D06","D07","D08","D09","D10","D11","D12","D13"));
    ArrayList<String> joker = new ArrayList<>(Collections.singletonList("JOKER"));

    public  ArrayList<String> cards(){
        ArrayList<String> card = new ArrayList<>();


        card.addAll(spade);
        card.addAll(heart);
        card.addAll(clover);
        card.addAll(diamond);
        card.addAll(joker);


        Collections.shuffle(card);
        for (String s : card) {
            System.out.print(s + ", ");
        }
        return card;

    }
}
