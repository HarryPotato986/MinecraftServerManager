package com.github.HarryPotato986;

import javax.swing.plaf.basic.BasicLookAndFeel;

public class MyLookAndFeel extends BasicLookAndFeel {

    /*
    This will take A LOT of time to do
    finish the feature set first
    this should be its own project
    */

    @Override
    public String getName() {
        return "PotatoGrey"; //Yes, I'm Canadian
    }

    @Override
    public String getID() {
        return "PotatoGrey";
    }

    @Override
    public String getDescription() {
        return "The PotatoGrey Look and Feel";
    }

    @Override
    public boolean isNativeLookAndFeel() {
        return false;
    }

    @Override
    public boolean isSupportedLookAndFeel() {
        return true;
    }


}
