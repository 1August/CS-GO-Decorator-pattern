package com.company.weapons.rifles;

import com.company.ISide;
import com.company.Weapons;

public class AWP extends Weapons {
    public AWP(ISide iSide) { super(iSide); }

    String getAWP(){ return "AWP rifle "; }

    @Override
    public String startBuying() { return super.startBuying() + getAWP(); }
}
