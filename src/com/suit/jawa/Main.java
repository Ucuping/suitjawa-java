package com.suit.jawa;

import java.util.Scanner;

public class Main {

    protected static String player, komputer;
    public static void main(String[] args) {
	// write your code here
        Scanner keyword = new Scanner(System.in);
        String ulang = "iya";
        while (ulang.equals("iya")) {
            System.out.print("Masukkan pilihan anda (gajah, orang, semut) : ");
            player = keyword.nextLine();
            komputer = getPilihanComputer();
            String hasil = getHasil(player, komputer);
            System.out.print("Pilihan anda : " + player + "\nPilihan komputer : " + komputer + "\nHasilnya : " + hasil);
            System.out.print("\nMain lagi (iya, tidak) : ");
            ulang = keyword.nextLine();
        }
        System.out.print("\nTerima kasih!");
    }

    protected static String getPilihanComputer() {
        double komp = Math.random();
        if(komp < 0.34) return "gajah";
        if(komp >= 0.34 && komp < 0.67) return "orang";
        return "semut";
    }

    protected static String getHasil(String player, String komputer) {
        if(player.equals(komputer)) return "SERI!";
        if(player.equals("gajah")) return (komputer.equals("orang")) ? "MENANG!" : "KALAH!";
        if(player.equals("orang")) return (komputer.equals("gajah")) ? "KALAH!" : "MENANG!";
        if(player.equals("semut")) return (komputer.equals("gajah")) ? "MENANG!" : "KALAH!";
        return "Pilihan anda tidak ada!";
    }
}
