public class Main {
    public static void main(String[] args) {

        char harf = 'Ü';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın Sesli Harf");
                break;
            case'E':
            case'İ':
            case'Ö':
            case'Ü':
                System.out.println("İnce Sesli Harf");
                break;
            default:
                System.out.println("Hatalı Harf Seçimi...");
        }

        /*char[] kalinSesliHarfler = new char[] {'A','I','O','U'};
        char[] inceSesliHarfler = new char[] {'E','İ','Ö','Ü'};

        for (char abc:kalinSesliHarfler) {
            if (harf == abc){
                System.out.println("Harf Kalın Seslidir.");
            }
        }
        for (char abc:inceSesliHarfler) {
            if (harf == abc){
                System.out.println("Harf ince Seslidir.");
            }
        }*/


    }
}