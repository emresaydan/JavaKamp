public class Main {
    public static void main(String[] args) {

        char grade = 'C';

        switch (grade){
            case 'A' :
                System.out.println("Mükemmel : Geçitiniz.");
                break;

            case 'B' :
                System.out.println("İyi : Geçitiniz.");
                break;
            case 'C' :
                System.out.println("Fena Değil : Geçitiniz.");
                break;
            case 'D' :
                System.out.println("Maalesef Kaldınız...");
                break;
            default:
                System.out.println("Geçersiz not girdiniz.");

        }
    }
}