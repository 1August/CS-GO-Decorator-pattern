package com.company.weapons.rifles;

import com.company.ISide;
import com.company.Weapons;

public class P90 extends Weapons {
    public P90(ISide iSide) { super(iSide); }

    String getP90(){ return "P90 rifle "; }

    @Override
    public String startBuying() { return super.startBuying() + getP90(); }
}
