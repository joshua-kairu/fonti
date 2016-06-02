package com.jlt.graphiscaler;

import android.support.annotation.StyleableRes;

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

// begin class DisplayFontItem
// an item showcasing a particular font
// will be displayed in the recycler view
public class DisplayFontItem {

    /** CONSTANTS */

    /** VARIABLES */

    /* Fonts */

    private Font font; // the font of this font item

    /* Strings */

    private String title; // title of this font item

    /* Styles */

    @StyleableRes
    private int helloWorldStyle; // the style of the hello world

    /** CONSTRUCTOR */

    // begin constructor
    public DisplayFontItem( Font font, String title, int helloWorldStyle ) {

        setFont( font );
        setTitle( title );
        setHelloWorldStyle( helloWorldStyle );

    } // end constructor

    /** METHODS */

    /** Getters and Setters */

    // getter for the font
    public Font getFont() { return font; }

    // setter for the font
    public void setFont( Font font ) { this.font = font; }

    // getter for the title
    public String getTitle() { return title; }

    // setter for the title
    public void setTitle( String title ) { this.title = title; }

    // getter for the helloWorldStyle
    public int getHelloWorldStyle() { return helloWorldStyle; }

    // setter for the helloWorldStyle
    public void setHelloWorldStyle( int helloWorldStyle ) { this.helloWorldStyle = helloWorldStyle; }

    /** Overrides */

    /** Other Methods */

} // end class DisplayFontItem