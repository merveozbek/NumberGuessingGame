package p1;

import java.util.Random;

public class OyunKontrolcusu {
    Random random = new Random();
    int rastgeleSayi = random.nextInt(11);

    Oyuncu oyuncu;
    int hakki;

    public OyunKontrolcusu(Oyuncu oyuncu) {
        this.oyuncu = oyuncu;
        int hakki =oyuncu.hak;
    }

    public void basla (){
        while(oyuncu.hak>0){

            int tahminEdilenSayi = oyuncu.sayiTahminet();
            if(tahminEdilenSayi==rastgeleSayi){
                oyuncu.puan+=10;
                System.out.println("evet"+oyuncu.isim +"doğru bildinve puanın"+oyuncu.puan);
            }

            else if (tahminEdilenSayi>rastgeleSayi){
                oyuncu.hak -=1;
                oyuncu.puan -=2;
                System.out.println("yukarıda bir sayi girdin.");
            }else{
                oyuncu.hak -=1;
                oyuncu.puan -=2;
                System.out.println("aşağıda bir sayi girdin");
            }
        }

    }

    public  void oyuncuSifirla(){
        oyuncu.hak= hakki;
    }
}
