public class Main {
    public static void main(String[] args) {

        int sayi1 = 220;
        int sayi2 = 284;

        int topla1 = 0;
        int topla2 = 0;

        for (int i = 1; i < sayi1; i++) {
            if(sayi1%i == 0){
                topla1 +=i;
            }
        }
        for (int i = 1; i < sayi2; i++) {
            if (sayi2 % i == 0) {
                topla2 += i;
            }
        }
        if (topla1 == sayi2 && topla2 == sayi1){
            System.out.println("Sayılar arkadaş sayılardır." + " Sayı 1 Toplamı : " + topla1 + " Sayı 2 Toplamı : " + topla2);
        }else{
            System.out.println("Sayılar arkadaş sayı değillerdir." + " Sayı 1 Toplamı : " + topla1 + " Sayı 2 Toplamı : " + topla2);
        }
        // Engin hocanın yaptığı gibi olmuş.
    }
}