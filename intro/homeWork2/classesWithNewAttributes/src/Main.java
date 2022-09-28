public class Main {
    public static void main(String[] args) {
        // Parametreli Constructor
        Product product1 = new Product(1,"Telefon","cep telefonu",6000,"Kırmızı",5);

        Product product = new Product();
        product.setName("Laptop");//setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(500);
        product.setStockAmount(5);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        productManager.Add2(2,"Siyah Mause","Siyah Mouse",4,350);

        System.out.println(product.getName());
        System.out.println(product.getKod());
        System.out.println(product1.getName());
    }
}