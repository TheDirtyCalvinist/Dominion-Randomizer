/*
 * Copyright (c) 2011.
 *
 *     This file is part of Dominion Randomizer.
 *
 *     Dominion Randomizer is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Dominion Randomizer is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Dominion Randomizer.  If not, see <http://www.gnu.org/licenses/>.
 */

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
