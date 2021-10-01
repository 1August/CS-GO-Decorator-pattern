package com.company.weapons.pistols;

import com.company.ISide;
import com.company.Weapons;

public class DesertEagle extends Weapons {
    public DesertEagle(ISide iSide) { super(iSide); }

    String getDesertEagle(){ return "Desert Eagle pistol "; }

    @Override
    public String startBuying() { return super.startBuying() + getDesertEagle(); }
}
