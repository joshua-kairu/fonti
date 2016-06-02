package com.jlt.graphiscaler;

import android.app.Activity;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;

/**

 Graphiscaler

 Tutorial for showcasing typographical scale

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

// begin activity MainActivity
public class MainActivity extends Activity {

    /** CONSTANTS */

    public static Font[] fonts;

    /** VARIABLES */

    /** METHODS */

    /** Getters and Setters */

    /**
     * Overrides
     */

    @Override
    // begin onCreate
    protected void onCreate( Bundle savedInstanceState ) {

        // 0. super things
        // 1. initialize the fonts
        // 2. use the main activity layout

        // 0. super things

        super.onCreate( savedInstanceState );

        // 1. initialize the fonts

        Font localFonts[] =
                {
                        new Font( "Default", null ), // the default font
                        new Font( "Courgette Regular", Typeface.createFromAsset( getAssets(), "Courgette-Regular.ttf" ) ), // Courgette Regular
//                        new Font( "Fixed Medium Semi Condensed", Typeface.createFromAsset( getAssets(), "Fixed-Medium-Semi-Condensed.pcf.gz" ) ), // Fixed Medium Semi Condensed
                        new Font( "Noto Sans Bold", Typeface.createFromAsset( getAssets(), "NotoSans-Bold.ttf" ) ) // Noto Sans Bold
//                        new Font( "Oxygen Mono Regular", Typeface.createFromAsset( getAssets(), "OxygenMono-Regular.ttf" ) ), // Oxygen Mono Regular
//                        new Font( "URW Gothic Regular", Typeface.createFromAsset( getAssets(), "URW-Gothic-Regular.pfb" ) ) // URW Gothic Regular
                };

        fonts = localFonts;

        // 2. use the main activity layout

        setContentView( R.layout.activity_main );

    } // end onCreate

    /**
     * Other Methods
     */

    // begin method getFontIndex
    // tells the index of a font in the fonts array
    public static int getFontIndex( Font font ) {

        // 0. go through all the fonts in the font array
        // 0a. if the current font matches the parameter font
        // 0a1. return the current font's index
        // 1. at the end of the fonts return -1 (no font found that matches)

        // 0. go through all the fonts in the font array

        // begin for through the fonts
        for ( int i = 0; i < fonts.length; i++ ) {

            // 0a. if the current font matches the parameter font
            // 0a1. return the current font's index

            // 0a. if the current font matches the parameter font

            // 0a1. return the current font's index

            if ( fonts[ i ].equals( font ) == true ) { return i; }

        } // end for through the fonts

        // 1. at the end of the fonts return -1

        return -1;

    } // end method getFontIndex

    // begin method getFontIndexFromTypeface
    // tells the index of a font in the fonts array given its typeface
    public static int getFontIndexFromTypeface( Typeface typeface ) {

        // 0. go through all the fonts in the font array
        // 0a. if the current font's typeface matches the parameter typeface
        // 0a1. return the current font's index
        // 1. at the end of the fonts return -1 (no font found that matches)

        // 0. go through all the fonts in the font array

        // begin for through the fonts
        for ( int i = 0; i < fonts.length; i++ ) {

            // 0a. if the current font's typeface matches the parameter typeface
            // 0a1. return the current font's index

            // 0a. if the current font's typeface matches the parameter typeface

            // 0a1. return the current font's index

            if ( fonts[ i ].getTypeface().equals( typeface ) == true ) { return i; }

        } // end for through the fonts

        // 1. at the end of the fonts return -1

        return -1;

    } // end method getFontIndexFromTypeface

} // end activity MainActivity