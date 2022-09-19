public class Main {
    public static void main(String[] args) {
        // For Loop
        System.out.println("For Loop");

        for (int i = 0; i < 10; i++) {
        System.out.println(i);
        }
        System.out.println("Döngü Bitti.");

        for (int i = 1; i < 10; i+=2) {
            System.out.println(i);
        }
        System.out.println("Döngü Bitti.");

        //While Loop
        System.out.println("While Loop");

        int i = 1;
        while (i<20){
            System.out.println(i);
            i++; // i+=2
        }
        //Do While loop - şartlar geçerli olmasa bile en azından bir kere çalışacaktır.
        System.out.println("Do While Loop");
        int j = 1;

        do {
            System.out.println(j);
            j+=2;
        }while (j<20);
    }
}