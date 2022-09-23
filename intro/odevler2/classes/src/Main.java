public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
        customerManager.remove();
        customerManager.update();

        //value
        int sayi1 = 10;
        int sayi2 = 20;

        sayi1 = sayi2;

        sayi2 = 45;
        System.out.println(sayi2); // Değer tip

        int[] sayilar1 = new int[] {1,2,3,4};
        int[] sayilar2 = new int[]{7,8,9,10};

        sayilar1 = sayilar2;

        sayilar2[0] = 15;

        System.out.println(sayilar1[0]); // referans tip
    }
}