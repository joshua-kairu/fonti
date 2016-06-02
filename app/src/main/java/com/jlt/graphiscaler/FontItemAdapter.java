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

        return new DisplayFontItemViewHolder( displayFontItemView );

    } // end onCreateViewHolder

    @Override
    // begin onBindViewHolder
    public void onBindViewHolder( final DisplayFontItemViewHolder displayFontItemViewHolder, int position ) {

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

        DisplayFontItem displayFontItem = displayFontItems.get( position );

        // 1. set the typeface based on the gotten font item

        TextView

        titleTextView = displayFontItemViewHolder.titleTextView,
        helloWorldTextView = displayFontItemViewHolder.helloWorldTextView;

        titleTextView.setText( displayFontItem.getTitle() );
        titleTextView.setTypeface( displayFontItem.getFont().getTypeface() );
        helloWorldTextView.setTypeface( displayFontItem.getFont().getTypeface() );

        // 2. initialize the spinner

        final Spinner fontsSpinner = displayFontItemViewHolder.fontsSpinner;

        // 2a. use the font spinner array adapter

        FontsSpinnerArrayAdapter fontsSpinnerArrayAdapter = new FontsSpinnerArrayAdapter( activity );

        fontsSpinner.setAdapter( fontsSpinnerArrayAdapter );

        // 2b. set the selected font to be the one matching the font of the current font item

        int s = MainActivity.getFontIndex( displayFontItem.getFont() );
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
                        // 2c3. create a payload indicating the current recycler item needs to be changed
                        // 2c4. notify the recycler view of the necessary change

                        // 2c1. set it as the selected item

                        fontsSpinner.setSelection( selectedSpinnerItemPosition );

                        // 2c2. get the font represented by the selected item

                        Font selectedFont = MainActivity.fonts[ selectedSpinnerItemPosition ];

                        // 2c3. create a payload indicating the current recycler item needs to be changed

                        DisplayFontItemRecyclerViewPayload recyclerViewPayload = new DisplayFontItemRecyclerViewPayload( DisplayFontItemRecyclerViewPayload.CHANGE_FONT, selectedFont );

                        // 2c4. notify the recycler view of the necessary change

//                        notifyItemChanged( displayFontItemViewHolder.getAdapterPosition(), recyclerViewPayload );

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

//    @Override
//    // begin onBindViewHolder
//    // this one has a payload
//    // called by notifyItemChanged
//    // used when we want to change something specific about an item
//    public void onBindViewHolder( DisplayFontItemViewHolder displayFontItemViewHolder, int position, List< Object > payloads ) {
//
//        // 0. go through all the payloads
//        // 0a. if the payload is an instance of the DisplayFontItemRecyclerViewPayload
//        // 0a1. cast the payload to an object of DisplayFontItemRecyclerViewPayload
//        // 0a2. if we are supposed to change the font
//        // 0a2a. get the display font item object based on the position
//        // 0a2b. set the typeface based on the gotten font item
//
//        // 0. go through all the payloads
//
//        // begin enhanced for through the payloads
//        for ( Object payload : payloads ) {
//
//            // 0a. if the payload is an instance of the DisplayFontItemRecyclerViewPayload
//
//            // begin if for if the payload is a kind of DisplayFontItemRecyclerViewPayload
//            if ( payload instanceof DisplayFontItemRecyclerViewPayload ) {
//
//                // 0a1. cast the payload to an object of DisplayFontItemRecyclerViewPayload
//
//                DisplayFontItemRecyclerViewPayload recyclerViewPayload = ( DisplayFontItemRecyclerViewPayload ) payload;
//
//                // 0a2. if we are supposed to change the font
//
//                // begin if for if the payload change type involves changing font
//                if ( recyclerViewPayload.getChangeType().equals( DisplayFontItemRecyclerViewPayload.CHANGE_FONT ) == true ) {
//
//                    // 0a2a. get the display font item object based on the position
//
//                    DisplayFontItem displayFontItem = displayFontItems.get( position );
//
//                    // 0a2b. set the typeface based on the gotten font item
//
//                    TextView
//
//                    titleTextView = displayFontItemViewHolder.titleTextView,
//                    helloWorldTextView = displayFontItemViewHolder.helloWorldTextView;
//
//                    titleTextView.setTypeface( displayFontItem.getFont().getTypeface() );
//                    helloWorldTextView.setTypeface( displayFontItem.getFont().getTypeface() );
//
//                } // end if for if the payload change type involves changing font
//
//            } // end if for if the payload is a kind of DisplayFontItemRecyclerViewPayload
//
//        } // end enhanced for through the payloads
//
//    } // end onBindViewHolder

    /** Other Methods */

} // end class FontItemAdapter