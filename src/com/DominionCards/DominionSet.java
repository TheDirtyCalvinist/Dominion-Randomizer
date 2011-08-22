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
