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
 *
 *     Except for stuff that belongs to Donald Vaccarino and Rio Grande Games (basically any text from the game).
 */

package com.DominionCards;

import android.graphics.drawable.Drawable;

/**
 * Created by IntelliJ IDEA.
 * User: thedirtycalvinist
 * Date: 8/20/11
 * Time: 9:57 PM
 * To change this template use File | Settings | File Templates.
 */
public enum DominionSet {

    BASIC("Basic"),
    INTRIGUE("Intrigue"),
    ALCHEMY("Alchemy"),
    SEASIDE("Seaside"),
    PROSPERITY("Prosperity"),
    CORNUCOPIA("Cornucopia"),
    PROMO("Promo");

    private String mName;
    private Drawable mIcon;

    private DominionSet(String name){
        mName = name;
    }

    public String getName(){
        return mName;
    }

    public String toString(){
        return mName;
    }

}
