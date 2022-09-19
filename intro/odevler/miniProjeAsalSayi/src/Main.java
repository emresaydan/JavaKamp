public class Main {
    public static void main(String[] args) {

        int number = 22;

        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number%i==0){
                isPrime = false;
            }
        }
        if (isPrime){
            System.out.println("Sayi  asaldir.");
        }else{
            System.out.println("Sayi asal değildir.");
        }

        /*System.out.println("Bir sayi giriniz : ");

        int sayi="15"
        int sayac = 0;
        if(sayi<1){
            System.out.println("Sadece 1'den büyük sayılar asal sayı olabilir.");
        }
        else{
            for(int i=1;i<=sayi;i++){
                int kalan=sayi%i;
                if(kalan==0){
                    sayac++;
                }
            }
            if(sayac==2){
                System.out.println("Sayi asaldir");
            }
            else{
                System.out.println("Sayi asal degildir");
            }*/


        }
    }
