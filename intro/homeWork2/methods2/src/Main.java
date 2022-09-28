public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava ok güzel.";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);

        int sayi = topla(5,5);
        System.out.println(sayi);

        int sayi2 = topla2(2,3,4,5,6,70);
        System.out.println(sayi2);

    }
    public static void ekle(){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Güncellendi");
    }
    public static int topla(int sayi1, int sayi2){
        return sayi1+sayi2;
    }

    public static String sehirVer(){
        return "Ankara";
    }
    public static int topla2(int... sayilar){
        int toplam = 0;
        //for (sayi:sayilar){toplam+=sayi;}
        for (int i = 0; i <sayilar.length; i++) {
            toplam += sayilar[i];
        }
        return toplam;
    }
}