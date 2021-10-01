package com.company;

public abstract class Weapons implements ISide {
    private ISide iSide;

    public Weapons(ISide iSide) { this.iSide = iSide; }

    @Override
    public String startBuying() { return iSide.startBuying(); }
}
