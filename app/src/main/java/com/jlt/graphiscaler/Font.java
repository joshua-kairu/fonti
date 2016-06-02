package com.jlt.graphiscaler;

import android.graphics.Typeface;

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

// begin class Font
// a font
public class Font {

    /** CONSTANTS */

    /** VARIABLES */

    /* Strings */

    private String name; // the font's name

    /* Typefaces */

    private Typeface typeface; // the font's typeface

    /** CONSTRUCTOR */

    // begin constructor
    public Font( String name, Typeface typeface ) {

        // 0. initialize font
        // 1. initialize typeface

        // 0. initialize font

        setName( name );

        // 1. initialize typeface

        setTypeface( typeface );

    } // end constructor

    /** METHODS */

    /** Getters and Setters */
    // getter for the name

    public String getName() { return name; }

    // setter for the name
    public void setName( String name ) { this.name = name; }

    // getter for the typeface
    public Typeface getTypeface() { return typeface; }

    // setter for the typeface
    public void setTypeface( Typeface typeface ) { this.typeface = typeface; }

    /** Overrides */

    @Override
    // toString
    // display the name of the font
    public String toString() { return getName(); }

    /** Other Methods */

} // end class Font