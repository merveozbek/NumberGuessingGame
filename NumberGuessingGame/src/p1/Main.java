package p1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Oyuncu merve = new Oyuncu(3,0,"merve");
        OyunKontrolcusu oyun = new OyunKontrolcusu(merve);

        oyun.basla();



    }
}
