package com.jlt.graphiscaler;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Spinner;
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

// begin class DisplayFontItemViewHolder
// holds each font display item in the recycler view
public class DisplayFontItemViewHolder extends RecyclerView.ViewHolder {


    /** CONSTANTS */

    /** VARIABLES */

    /* Spinners */

    public Spinner fontsSpinner; // spinner to hold the fonts

    /* Text Views */

    public TextView

    titleTextView, // text view for the title
    helloWorldTextView; // text view for the hello world

    /** CONSTRUCTOR */

    // begin constructor
    public DisplayFontItemViewHolder( View itemView, Activity activity ) {

        // 0. super things
        // 1. initialize the controls

        // 0. super things

        super( itemView );

        // 1. initialize the controls

        fontsSpinner = ( Spinner ) itemView.findViewById( R.id.idfi_s_fonts );

        FontsSpinnerArrayAdapter fontsSpinnerArrayAdapter = new FontsSpinnerArrayAdapter( activity );

        fontsSpinner.setAdapter( fontsSpinnerArrayAdapter );

        titleTextView = ( TextView ) itemView.findViewById( R.id.idfi_tv_title );

        helloWorldTextView = ( TextView ) itemView.findViewById( R.id.idfi_tv_hello_world );

    } // end constructor

    /** METHODS */

    /** Getters and Setters */

    /** Overrides */

    /** Other Methods */

} // end class DisplayFontItemViewHolder