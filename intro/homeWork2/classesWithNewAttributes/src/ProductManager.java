public class ProductManager {

    //JDBS
    public void Add(Product product){
        System.out.println("Ürün eklendi : " + product.getName());
    }
    //Hatalı kullanım
    public void Add2(int id, String name,String description,int stockAmount, double price) {

    }
}
