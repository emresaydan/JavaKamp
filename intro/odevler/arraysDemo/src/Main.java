public class Main {
    public static void main(String[] args) {

        //String ogrenci1 = "Emre";
        //String ogrenci2 = "Gülcan";
        //String ogrenci3 = "Yiğit";
        //String ogrenci4 = "Anıl";

        //System.out.println(ogrenci1);
        //System.out.println(ogrenci2);
        //System.out.println(ogrenci3);
        //System.out.println(ogrenci4);

        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Emre";
        ogrenciler[1] = "Gülcan";
        ogrenciler[2] = "Yiğit";


        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("**********************************");

        for (String ogrenci:ogrenciler) {
            System.out.println(ogrenci);
        }
    }
}