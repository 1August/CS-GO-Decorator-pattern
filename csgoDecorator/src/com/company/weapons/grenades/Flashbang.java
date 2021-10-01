package com.company.weapons.grenades;

import com.company.ISide;
import com.company.Weapons;

public class Flashbang extends Weapons {
    public Flashbang(ISide iSide) { super(iSide); }

    String getFlashbang(){ return "Flashbang grenade "; }

    @Override
    public String startBuying() { return super.startBuying() + getFlashbang(); }
}
