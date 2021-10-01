package com.company;

import java.util.Scanner;

public class BuyWeapons {
    static ISide buy(ISide iSide) {
        Scanner scanner = new Scanner(System.in);
        BuyService buyService = new BuyService();
        System.out.println("Choose weapon:");
        System.out.println("-----");
        System.out.println("Pistols:");
        System.out.println("1. Glock18");
        System.out.println("2. DesertEagle");
        System.out.println("0. P2000");
        int pistol = scanner.nextInt();

        System.out.println("-----");
        System.out.println("Rifles:");
        System.out.println("1. P90");
        System.out.println("2. FAMAS");
        System.out.println("3. M4A1");
        System.out.println("4. AWP");
        System.out.println("0. Random");
        int rifle = scanner.nextInt();

        System.out.println("-----");
        System.out.println("Grenades:");
        System.out.println("1. Smoke");
        System.out.println("2. Flashbang");
        System.out.println("3. Smoke + Flashbang");
        System.out.println("0. Random");
        int grenade = scanner.nextInt();

        return buyService.buyAll(pistol, rifle, grenade, iSide);
    }
}
