package com.company.weapons.pistols;

import com.company.ISide;
import com.company.Weapons;

public class Glock18 extends Weapons {
    public Glock18(ISide iSide) { super(iSide); }

    String getClock(){ return "Glock-18 pistol "; }

    @Override
    public String startBuying() { return super.startBuying() + getClock(); }
}
