import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";

       /* System.out.println(mesaj);
        System.out.println("Karaker Sayısı = " +mesaj.length());
        System.out.println("5. Eleman = " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!")); // Metin birleştirme
        System.out.println(mesaj.startsWith("B")); // Ne ile başlıyor? - True veya false döndürür
        System.out.println(mesaj.endsWith("c")); // Ne ile bitiyor ?
        char[] karakerler = new char[5];
        mesaj.getChars(0,5,karakerler,0); // karakterleri char dizisine aktarma
        System.out.println(karakerler);
        System.out.println(mesaj.indexOf('a')); // Parantedeki karakterin mesaj içinde kaçıncı indexte olduğunu bulmaya yarar.
        System.out.println(mesaj.lastIndexOf("a")); // buda aramaya sondan başlar.*/

        System.out.println(mesaj.replace(' ','-'));
        System.out.println(mesaj.substring(2));
        System.out.println(mesaj.substring(2,5));

        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase()); // Metni küçük harfe çevirme
        System.out.println(mesaj.toUpperCase()); // Metni büyük harfe çevirme
        System.out.println(mesaj.trim()); // başında sonunda boşluklar varsa onları siler.




    }
}