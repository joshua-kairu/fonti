package com.jlt.graphiscaler;

import android.app.Activity;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

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

// begin class FontsSpinnerArrayAdapter
// array adapter to populate the spinner for choosing fonts
// the spinner should show the font names written in their respective typefaces
public class FontsSpinnerArrayAdapter extends ArrayAdapter {

    /** CONSTANTS */

    /** VARIABLES */

    /* Activities */

    private Activity activity; // the activity hosting this spinner

    /** CONSTRUCTOR */

    // begin constructor
    public FontsSpinnerArrayAdapter( Activity activity ) {

        // 0. super the
        // activity('s context),
        // the layout resource ID that we'll use to inflate
        // the array that has the objects we want to see in the spinner
        // 1. initialize the host activity

        // 0. super the

        // begin super
        super(

                // activity('s context),
                activity,
                // the layout resource ID that we'll use to inflate
                android.R.layout.simple_spinner_item,
                // the array that has the objects we want to see in the spinner
                MainActivity.fonts

        ); // end super

        // 1. initialize the host activity

        this.activity = activity;

    } // end constructor

    /** METHODS */

    /** Getters and Setters */

    /** Overrides */

    @Override
    // begin getView
    // this displays the value of the spinner that is seen when a user selects an item in the spinner
    public View getView( int position, View convertView, ViewGroup parent ) {

        // 0. create inflater
        // 1. get the row view from the inflater
        // 2. get the text view from the row view
        // 3. set the text view's typeface to be that of the font at its position in the fonts array
        // 4. return the row view

        // 0. create inflater

        LayoutInflater layoutInflater = LayoutInflater.from( activity );

        // 1. get the row view from the inflater

        View rowView = layoutInflater.inflate( R.layout.font_spinner_display_item, parent, false );

        // 2. get the text view from the row view

        TextView fontTextView = ( TextView ) rowView.findViewById( R.id.fsdi_tv_text );

        // 3. set the text view's typeface to be that of the font at its position in the fonts array

        fontTextView.setText( MainActivity.fonts[ position ].getName() );
        fontTextView.setTypeface( MainActivity.fonts[ position ].getTypeface() );

        // 4. return the row view

        return rowView;

    } // end getView

    @Override
    // begin method getDropDownView
    // does getView for the dropdown items
    public View getDropDownView( int position, View convertView, ViewGroup parent ) {

        // 0. create inflater
        // 1. get the dropdown row view from the inflater
        // 2. get the text view from the dropdown row view
        // 3. set the text view's typeface to be that of the font at its position in the fonts array
        // 4. return the dropdown row view

        // 0. create inflater

        LayoutInflater layoutInflater = LayoutInflater.from( activity );

        // 1. get the dropdown row view from the inflater

        View dropdownView = layoutInflater.inflate( R.layout.font_spinner_drop_down_item, parent, false );

        // 2. get the text view from the dropdown row view

        TextView fontTextView = ( TextView ) dropdownView.findViewById( R.id.fsddi_tv_text );

        // 3. set the text view's typeface to be that of the font at its position in the fonts array

        fontTextView.setText( MainActivity.fonts[ position ].getName() );
        fontTextView.setTypeface( MainActivity.fonts[ position ].getTypeface() );

        // 4. return the dropdown row view

        return dropdownView;

    } // end method getDropDownView

    /** Other Methods */

} // end class FontsSpinnerArrayAdapter