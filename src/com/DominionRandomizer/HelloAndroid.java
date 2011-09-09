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

package com.DominionRandomizer;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.AndroidCharacter;
import android.view.View;
import android.widget.*;
import com.DominionCards.DominionCard;
import com.DominionCards.DominionSet;
import com.DominionCards.Randomizer;

import java.util.LinkedList;
import java.util.List;

public class HelloAndroid extends ListActivity
{

   private List<DominionSet> chosenSets;
   private boolean[] chosenSetsBools;
   private Randomizer randomizer;
   private List<DominionCard> tenChosenCards;
   private static CharSequence[] setNames = null;

   static final int DIALOG_CHOOSE_SETS = 1;

    /** Called when the activity is first created. */
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       chosenSets = new LinkedList<DominionSet>();
       setNames = new CharSequence[DominionSet.values().length];
       chosenSetsBools = new boolean[DominionSet.values().length];
       for(int i = 0; i < DominionSet.values().length; i++){
           chosenSets.add(DominionSet.values()[i]);
           chosenSetsBools[i] = true;
           setNames[i] = DominionSet.values()[i].getName();
       }

       randomizer = new Randomizer(chosenSets);
       tenChosenCards = randomizer.get10();
       setListAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, tenChosenCards));
       setContentView(R.layout.main);
   }

    public void randomize(View view){
        randomizer = new Randomizer(chosenSets);
        tenChosenCards = randomizer.get10();
        setListAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, tenChosenCards));
    }

    public void chooseSets(View view){
        showDialog(DIALOG_CHOOSE_SETS);
    }

    protected Dialog onCreateDialog(int id) {
        AlertDialog dialog;
        switch(id) {
        case DIALOG_CHOOSE_SETS:
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Which sets do you want?");
            builder.setMultiChoiceItems(setNames, chosenSetsBools, new DialogInterface.OnMultiChoiceClickListener() {
                public void onClick(DialogInterface dialog, int item, boolean isChecked) {
                    chosenSetsBools[item] = isChecked;
                    matchBoolsToSets();
                }
            });
            dialog = builder.create();
            break;
        default:
            dialog = null;
        }
        return dialog;
    }

    private void matchBoolsToSets(){
        chosenSets.clear();
        for(int i = 0; i < DominionSet.values().length; i++){
            if(chosenSetsBools[i])
                chosenSets.add(DominionSet.values()[i]);
       }
    }
}
