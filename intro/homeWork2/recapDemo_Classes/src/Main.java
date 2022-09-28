public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int toplama = dortIslem.Topla(3,5);

        System.out.println(toplama);


        int cikarma = dortIslem.Cikar(9,5);
        System.out.println(cikarma);
    }
}