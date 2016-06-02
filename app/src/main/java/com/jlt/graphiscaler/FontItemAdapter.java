package com.jlt.graphiscaler;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

/**

 Fonti

 Simple app to show some fonts in Android

 Copyright (C) 2016 Kairu Joshua Wambugu

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see http://www.gnu.org/licenses/.

 */

// begin class FontItemAdapter
// populates the font item recycler
public class FontItemAdapter extends RecyclerView.Adapter< DisplayFontItemViewHolder > {

    /** CONSTANTS */

    /** VARIABLES */

    /* Activities */

    private Activity activity; // the host activity

    /* Array Lists */

    private ArrayList< DisplayFontItem > displayFontItems; // the font items to be displayed

    /** CONSTRUCTOR */

    // constructor
    // initialize the font items and the activity
    public FontItemAdapter( Activity activity, ArrayList< DisplayFontItem > displayFontItems ) { this.displayFontItems = displayFontItems; this.activity = activity; }

    /** METHODS */

    /** Getters and Setters */

    /** Overrides */

    @Override
    // begin onCreateViewHolder
    public DisplayFontItemViewHolder onCreateViewHolder( ViewGroup parent, int viewType ) {

        // 0. get the parent context
        // 1. get an inflater from the parent context
        // 2. inflate the individual font item layout
        // 3. return a new font item view holder

        // 0. get the parent context

        // 1. get an inflater from the parent context

        LayoutInflater layoutInflater = LayoutInflater.from( parent.getContext() );

        // 2. inflate the individual font item layout

        View displayFontItemView = layoutInflater.inflate( R.layout.individual_display_font_item, parent, false );

        // 3. return a new font item view holder

        return new DisplayFontItemViewHolder( displayFontItemView, activity );

    } // end onCreateViewHolder

    @Override
    // begin onBindViewHolder
    public void onBindViewHolder( final DisplayFontItemViewHolder displayFontItemViewHolder, final int position ) {

        // 0. get the display font item object based on the position
        // 1. set the typeface based on the gotten font item
        // 2. initialize the spinner
        // 2a. use the font spinner array adapter
        // 2b. set the selected font to be the one matching the font of the current font item
        // 2c. when a spinner item is selected
        // 2c1. set it as the selected item
        // 2c2. get the font represented by the selected item
        // 2c3. create a payload indicating the current recycler item needs to be changed
        // 2c4. notify the recycler view of the necessary change

        // 0. get the display font item object based on the position

        final DisplayFontItem displayFontItem = displayFontItems.get( position );

        // 1. set the typeface based on the gotten font item

        final TextView

        titleTextView = displayFontItemViewHolder.titleTextView,
        helloWorldTextView = displayFontItemViewHolder.helloWorldTextView;

        titleTextView.setText( displayFontItem.getTitle() );
        titleTextView.setTypeface( displayFontItem.getFont().getTypeface() );
        helloWorldTextView.setTypeface( displayFontItem.getFont().getTypeface() );

        // 2. initialize the spinner

        final Spinner fontsSpinner = displayFontItemViewHolder.fontsSpinner;

        // 2a. use the font spinner array adapter -> done in the DisplayFontItemViewHolder constructor

        // 2b. set the selected font to be the one matching the font of the current font item

        fontsSpinner.setSelection( MainActivity.getFontIndex( displayFontItem.getFont() ) );

        // 2c. when a spinner item is selected

        // begin fontsSpinner.setOnItemSelectedListener
        fontsSpinner.setOnItemSelectedListener(

                // begin new AdapterView.OnItemSelectedListener
                new AdapterView.OnItemSelectedListener() {

                    @Override
                    // begin onItemSelected
                    public void onItemSelected( AdapterView< ? > parent, View view, int selectedSpinnerItemPosition, long id ) {

                        // 2c1. set it as the selected item
                        // 2c2. get the font represented by the selected item
                        // 2c3. set the gotten font to be the font of the font item
                        // 2c4. notify the recycler view of the necessary change

                        // 2c1. set it as the selected item

                        fontsSpinner.setSelection( selectedSpinnerItemPosition );

                        // 2c2. get the font represented by the selected item

                        Font selectedFont = MainActivity.fonts[ selectedSpinnerItemPosition ];

                        // 2c3. set the gotten font to be the font of the font item

                        displayFontItems.set( displayFontItemViewHolder.getAdapterPosition(), new DisplayFontItem( selectedFont, displayFontItem.getTitle(), -1 ) );

                        // 2c4. notify the recycler view of the necessary change

                        notifyItemChanged( displayFontItemViewHolder.getAdapterPosition() );

                    } // end onItemSelected

                    @Override
                    // stub method onNothingSelected
                    public void onNothingSelected( AdapterView< ? > parent ) { }

                } // end new AdapterView.OnItemSelectedListener

        ); // end fontsSpinner.setOnItemSelectedListener

    } // end onBindViewHolder

    @Override
    // getItemCount
    public int getItemCount() { return displayFontItems.size(); }

    /** Other Methods */

} // end class FontItemAdapter