package com.company;

import com.company.sides.CounterTerrorist;
import com.company.sides.Terrorist;

import java.util.Scanner;

public class CreateCharacter {
    static ISide createCharacter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose side to create");
        System.out.println("-----");
        System.out.println("1. Terrorist");
        System.out.println("2. Counter-Terrorist");

        int characterChoice = scanner.nextInt();
        return (characterChoice == 1 ? new Terrorist() : characterChoice == 2 ? new CounterTerrorist() : createCharacter());
    }
}
