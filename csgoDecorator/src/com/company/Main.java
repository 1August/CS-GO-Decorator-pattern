package com.company;

import com.company.sides.Terrorist;
import com.company.weapons.pistols.DesertEagle;
import com.company.weapons.rifles.AWP;

import static com.company.CreateCharacter.createCharacter;
import static com.company.BuyWeapons.buy;

public class Main {
    public static void main(String[] args) {
        ISide dynamicCharacter = buy(createCharacter());
        System.out.println(dynamicCharacter.startBuying());

        ISide staticCharacter = new DesertEagle(new AWP(new Terrorist()));
        System.out.println(staticCharacter.startBuying());
    }
}
