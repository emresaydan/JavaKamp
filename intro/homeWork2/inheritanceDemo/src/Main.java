public class Main {
    public static void main(String[] args) {
        //OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        //ogretmenKrediManager.Hesapla();

        //Polymorphism

        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new OgretmenKrediManager());

        KrediUI krediUI1 =new KrediUI();
        krediUI1.KrediHesapla(new TarimKrediManager());
    }
}