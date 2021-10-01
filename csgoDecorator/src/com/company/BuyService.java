package com.company;

import com.company.weapons.grenades.Flashbang;
import com.company.weapons.grenades.Smoke;
import com.company.weapons.pistols.DesertEagle;
import com.company.weapons.pistols.Glock18;
import com.company.weapons.pistols.P2000;
import com.company.weapons.rifles.AWP;
import com.company.weapons.rifles.FAMAS;
import com.company.weapons.rifles.M4A1;
import com.company.weapons.rifles.P90;

public class BuyService {
    ISide buyAll(int pistol, int rifle, int grenade, ISide iSide){
        return buyPistol(pistol, buyRifle(rifle, buyGrenades(grenade, iSide)));
    }

    private ISide buyPistol(int choose, ISide iSide){
        switch (choose){
            case 1: return new Glock18(iSide);
            case 2: return new DesertEagle(iSide);
            default: return new P2000(iSide);
        }
    }

    private ISide buyRifle(int choose, ISide iSide){
        if (choose < 1 || choose > 4) choose = (int)Math.ceil(Math.random()*4);
        switch (choose){
            case 1: return new P90(iSide);
            case 2: return new FAMAS(iSide);
            case 3: return new M4A1(iSide);
            case 4: return new AWP(iSide);
            default: return null;
        }
    }

    private ISide buyGrenades(int choose, ISide iSide){
        if (choose < 1 || choose > 4) choose = (int)Math.ceil(Math.random()*3);
        switch (choose){
            case 1: return new Smoke(iSide);
            case 2: return new Flashbang(iSide);
            case 3: return new Smoke(new Flashbang(iSide));
            default: return null;
        }
    }
}