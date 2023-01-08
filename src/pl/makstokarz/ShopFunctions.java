package pl.makstokarz;

public interface ShopFunctions {

    void runFirst();
    void addProduct(String name, double price, int quantity);
    void updateProduct(String name, double price, long id, int quantity);
    void deleteProduct(long id);
    boolean findProduct(long id);
    void showAllProducts();


}
