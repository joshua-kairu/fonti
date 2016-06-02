package com.jlt.graphiscaler;

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

// begin class DisplayFontItemRecyclerViewPayload
// payload to be used when the a change in properties of the recycler view items is necessary
public class DisplayFontItemRecyclerViewPayload {

    /** CONSTANTS */

    /* Strings */

    public static final String CHANGE_FONT = "CHANGE_FONT"; // string to say we want to change the font

    /** VARIABLES */

    /* Objects */

    private Object newValue; // the new value to be applied to the recycler view item (could be a new font)

    /* Primitives */

//    private int index; // the index of the item to be changed

    /* Strings */

    private String changeType; // the type of change to do on the item

    /** CONSTRUCTOR */

    // begin constructor
    public DisplayFontItemRecyclerViewPayload( String changeType, Object newValue ) {

        // 0. initialize the fields

        // 0. initialize the fields

//        setIndex( index );
        setChangeType( changeType );
        setNewValue( newValue );

    } // end constructor


    /** METHODS */

    /** Getters and Setters */

    // getter for the newValue
    public Object getNewValue() { return newValue; }

    // setter for the newValue
    public void setNewValue( Object newValue ) { this.newValue = newValue; }

//     getter for the index
//    public int getIndex() { return index; }
//
//    // setter for the index
//    public void setIndex( int index ) { this.index = index; }

    // getter for the changeType
    public String getChangeType() { return changeType; }

    // setter for the changeType
    public void setChangeType( String changeType ) { this.changeType = changeType; }

    /** Overrides */

    /** Other Methods */

} // end class DisplayFontItemRecyclerViewPayload