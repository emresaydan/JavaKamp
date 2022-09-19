public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //değişkenlerin isimlendirmeleri java'da camelCase yazılır.
        String ortaMetin = "İlginizi Çekebilir";
        String altMetin = "Vade Süresi";

        System.out.println("ortaMetin"); // String yazılır.
        System.out.println(ortaMetin);
        System.out.println(altMetin);

        int vade = 12;
        double dolarDun = 18.14;
        double dolarBugun = 18.10;

        boolean dolarDustumu = false;

        String okYonu = "down.svg";

        if(dolarBugun<dolarDun){
            okYonu = "down.svg";
            System.out.println(okYonu);
        } else if (dolarBugun>dolarDun) {
            okYonu = "up.svg";
            System.out.println(okYonu);
        }else{
            okYonu="equal.svg";
            System.out.println(okYonu);
        }
        //array
        String[] krediler = {"Hızlı Kredi", "Maaşını HalkBank'tan alanlar", "Mutlu Emekli"};
        //System.out.println(krediler[0]);
        //System.out.println(krediler[1]);
        //System.out.println(krediler[1]);

        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }
        System.out.println("**********************************");

        for (String s : krediler) {
            System.out.println(s);
        }
        

    }
}