public class Main {
    public static void main(String[] args) {

        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 5;
        boolean varMi = false;

        for (int i = 0; i < sayilar.length; i++) {
            if (i == aranacak){
                varMi = true;
                break;
            }else{
                varMi = false;
            }
        }
        if(varMi == true){
            System.out.println("Sayı Bulundu");
        }else{
            System.out.println("Sayı Bulunamadı.");
        }
    }
}