package p1;

import java.util.Scanner;

public class Oyuncu {

    int hak;
    int puan;
    String isim;

    public Oyuncu(int hak, int puan, String isim) {
        this.hak = hak;
        this.puan = puan;
        this.isim = isim;



    }

    public int sayiTahminet(){
        System.out.println("0-10 arasi sayi giriniz:");

        Scanner klavye= new Scanner(System.in);
        int girilensayi= klavye.nextInt();

        return girilensayi;

    }
}
