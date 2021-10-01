package com.company.weapons.pistols;

import com.company.ISide;
import com.company.Weapons;

public class P2000 extends Weapons {
    public P2000(ISide iSide) { super(iSide); }

    String getP2000(){ return "P2000 pistol "; }

    @Override
    public String startBuying() { return super.startBuying() + getP2000(); }
}
