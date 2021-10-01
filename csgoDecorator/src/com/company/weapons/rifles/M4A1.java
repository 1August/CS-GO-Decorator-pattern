package com.company.weapons.rifles;

import com.company.ISide;
import com.company.Weapons;

public class M4A1 extends Weapons {
    public M4A1(ISide iSide) { super(iSide); }

    String getM4A1(){ return "M4A1 rifle "; }

    @Override
    public String startBuying() { return super.startBuying() + getM4A1(); }
}
