package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String[] polozky = {" ", "1.houska", "2.cement", "3.knedlik", "4.branik", "5.sul", "6.africky sluha", "7.gf"};
        int[] ceny = {0, 2, 50, 20, 15, 10, 1, 999};
        String[] vybrano = new String[args.length];
        int[] nvm = new int[vybrano.length];
        int cena = 0;
        switch (args[0]) {
            case "help": {
                System.out.println("commandy:");
                System.out.println("vyber = zobrazi vyber");
                System.out.println("koupit + 'cislo produktu' = pridat a zaplatit produkty do kosiku");
                break;
            }
            case "vyber": {
                for (int i = 1; i < ceny.length; i++) {
                    System.out.println(polozky[i] + "..." + ceny[i] + "Kc");
                }
                break;
            }
            case "koupit": {
                for (int i = 1; i < args.length; i++) {
                    nvm[i] = Integer.parseInt(args[i]);
                    if (nvm[i] >= 1 && nvm[i] < 8) {
                        vybrano[i] = polozky[nvm[i]];
                        cena += ceny[nvm[i]];
                        System.out.println(vybrano[i] + "........." + ceny[nvm[i]] + "Kc");
                    } else {
                        System.out.println("neznama polozka");
                    }
                }
                System.out.println("celkem: " + cena);
                break;
            }
            default:
                System.out.println("nvm co chces, zkus napsat 'help'");
                break;
        }
    }
}