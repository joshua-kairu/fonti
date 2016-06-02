package com.jlt.graphiscaler;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**

 Fonti

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

// begin fragment MainActivityFragment
public class MainActivityFragment extends Fragment {

    /** CONSTANTS */

    /** VARIABLES */

    /* Recycler Views */

    @InjectView( R.id.fm_rv_font_items )
    RecyclerView fontItemsRecyclerView; // recycler view to show the font items

    /** METHODS */

    /** Getters and Setters */

    /**
     * Overrides
     */

    @Override
    // begin onCreateView
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState ) {

        // 0. inflate using the main fragment layout
        // 1. bind views
        // 2. initialize the recycler
        // 2a. make this the recycler view's layout manager
        // 2b. initialize the font items to display
        // 2c. use the font item view holder as the adapter
        // 3. return the inflated view

        // 0. inflate using the main fragment layout

        View rootView = inflater.inflate( R.layout.fragment_main, container, false );

        // 1. bind views

        ButterKnife.inject( this, rootView );

        // 2. initialize the recycler

        // 2a. make this the recycler view's layout manager

        fontItemsRecyclerView.setLayoutManager( new LinearLayoutManager( getActivity() ) );

        // 2b. initialize the font items to display

        ArrayList< DisplayFontItem > displayFontItems = new ArrayList<>();

        displayFontItems.add( new DisplayFontItem( MainActivity.fonts[ 0 ], getString( R.string.display4 ), -1 ) );
        displayFontItems.add( new DisplayFontItem( MainActivity.fonts[ 0 ], getString( R.string.display3 ), -1 ) );
        displayFontItems.add( new DisplayFontItem( MainActivity.fonts[ 0 ], getString( R.string.display2 ), -1 ) );
        displayFontItems.add( new DisplayFontItem( MainActivity.fonts[ 0 ], getString( R.string.display1 ), -1 ) );
        displayFontItems.add( new DisplayFontItem( MainActivity.fonts[ 0 ], getString( R.string.headline ), -1 ) );
        displayFontItems.add( new DisplayFontItem( MainActivity.fonts[ 0 ], getString( R.string.title ), -1 ) );
        displayFontItems.add( new DisplayFontItem( MainActivity.fonts[ 0 ], getString( R.string.subhead ), -1 ) );
        displayFontItems.add( new DisplayFontItem( MainActivity.fonts[ 0 ], getString( R.string.body2 ), -1 ) );
        displayFontItems.add( new DisplayFontItem( MainActivity.fonts[ 0 ], getString( R.string.body1 ), -1 ) );
        displayFontItems.add( new DisplayFontItem( MainActivity.fonts[ 0 ], getString( R.string.caption ), -1 ) );
        displayFontItems.add( new DisplayFontItem( MainActivity.fonts[ 0 ], getString( R.string.button ), -1 ) );

        // 2c. use the font item view holder as the adapter

        FontItemAdapter fontItemAdapter = new FontItemAdapter( getActivity(), displayFontItems );
        fontItemsRecyclerView.setAdapter( fontItemAdapter );

        // 3. return the inflated view

        return rootView;

    } // end onCreateView

    /** Other Methods */

} // end fragment MainActivityFragment