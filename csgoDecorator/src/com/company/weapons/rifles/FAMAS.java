package com.company.weapons.rifles;

import com.company.ISide;
import com.company.Weapons;

public class FAMAS extends Weapons {
    public FAMAS(ISide iSide) { super(iSide); }

    String getFAMAS(){ return "FAMAS rifle "; }

    @Override
    public String startBuying() { return super.startBuying() + getFAMAS(); }
}
