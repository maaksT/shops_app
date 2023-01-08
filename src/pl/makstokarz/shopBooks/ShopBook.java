package pl.makstokarz.shopBooks;

import pl.makstokarz.ShopFunctions;

import java.math.BigDecimal;
import java.util.*;

public class ShopBook implements ShopFunctions {

    private final List<Book> books = new ArrayList<>();
    private long ct = 0;
    private boolean methodCalled = false;

    public boolean isMethodCalled() {
        return methodCalled;
    }

    @Override
    public void runFirst(){
        methodCalled = true;
        addProduct("Krzyżacy",20.99, 55);
        addProduct("Ogniem i mieczem" ,125.00, 56);
        addProduct("Gra o tron" ,145.98, 98);
        addProduct("Potop" ,85.50, 44);
        addProduct("Zemsta" ,39.99, 88);
    }

    @Override
    public void addProduct(String name, double price, int quantity) {
        ct++;
        books.add(new Book(name,ct,BigDecimal.valueOf(price),quantity));

    }

    @Override
    public void updateProduct(String name, double price, long id, int quantity) {
        ListIterator<Book> iterator = books.listIterator();
        while (iterator.hasNext()){
            Book b = iterator.next();
            if (b.getId() == id){
                iterator.set(new Book(name, id, BigDecimal.valueOf(price), quantity));
                System.out.println("Produkt zaktualizowany!");
            }
        }
    }

    @Override
    public void deleteProduct(long id) {
        if (findProduct(id)){
            Iterator<Book> iterator = books.iterator();
            while (iterator.hasNext()){
                Book b = iterator.next();
                if (b.getId() == id){
                    iterator.remove();
                    System.out.println("Produkt usunięty!");
                }
            }
        }
    }

    @Override
    public boolean findProduct(long id) {
        for (Book b: books) {
            if (b.getId() == id){
                System.out.println(b);
                return true;
            }
        }
        System.out.println("Nie ma produktu o takim id!");
        return false;
    }


    @Override
    public void showAllProducts() {
        books.sort(Comparator.comparingLong(Book::getId));
        for (Book b: books) {
            System.out.println(b);
        }
    }
}

