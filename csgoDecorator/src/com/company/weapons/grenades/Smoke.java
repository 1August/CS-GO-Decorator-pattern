package com.company.weapons.grenades;

import com.company.ISide;
import com.company.Weapons;

public class Smoke extends Weapons {
    public Smoke(ISide iSide) { super(iSide); }

    String getSmoke(){ return "Smoke grenade "; }

    @Override
    public String startBuying() { return super.startBuying() + getSmoke(); }
}
