package com.DominionCards;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: thedirtycalvinist
 * Date: 8/20/11
 * Time: 9:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class Randomizer {

    private Stack<DominionCard> cards;

    public Randomizer(List<DominionSet> includedSets){
        cards = new Stack<DominionCard>();
        List<DominionCard> cardsBeforeShuffle = DominionCard.getCardsFromSets(includedSets);
        //shuffle
        Random rand = new Random();
        while(!cardsBeforeShuffle.isEmpty()){
            cards.push(cardsBeforeShuffle.remove(rand.nextInt(cardsBeforeShuffle.size())));
        }
    }

    public List<DominionCard> get10(){
        ArrayList<DominionCard> ten = new ArrayList<DominionCard>(10);
        if(cards.size() <= 10){
            ten.addAll(cards);
            cards.clear();
        }
        else {
            for(int i = 0; i < 10; i++){
                ten.add(cards.pop());
            }
        }
        return ten;
    }

}
