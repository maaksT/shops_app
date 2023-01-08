package pl.makstokarz.shopGames;

import pl.makstokarz.ShopFunctions;


import java.math.BigDecimal;
import java.util.*;

public class Shop implements ShopFunctions {

    private final List<Game> games = new ArrayList<>();
    private long ct = 0;
    private boolean methodCalled = false;

    public boolean isMethodCalled() {
        return methodCalled;
    }

    @Override
    public void runFirst(){
        methodCalled = true;
        addProduct("CYBERPUNK",200.99, 11);
        addProduct("FRY CRY 5" ,125.00, 32);
        addProduct("CS GO" ,145.98, 55);
        addProduct("FIFA" ,85.50, 65);
        addProduct("GTA" ,399.99, 87);
    }

    @Override
    public void addProduct(String name, double price, int quantity) {
        ct++;
        games.add(new Game(name,ct,BigDecimal.valueOf(price),quantity));

    }

    @Override
    public void updateProduct(String name, double price, long id, int quantity) {
        ListIterator<Game> iterator = games.listIterator();
        while (iterator.hasNext()){
            Game g = iterator.next();
            if (g.getId() == id){
                iterator.set(new Game(name, id, BigDecimal.valueOf(price), quantity));
                System.out.println("Produkt zaktualizowany!");
            }
        }
    }

    @Override
    public void deleteProduct(long id) {
        if (findProduct(id)){
            Iterator<Game> iterator = games.iterator();
            while (iterator.hasNext()) {
                Game g = iterator.next();
                if (g.getId() == id) {
                    iterator.remove();
                    System.out.println("Produkt usunięty!");
                }
            }
        }
    }

    @Override
    public boolean findProduct(long id) {
        for (Game g: games) {
            if (g.getId() == id){
                System.out.println(g);
                return true;
            }
        }
        System.out.println("Nie ma produktu o takim id!");
        return false;
    }


    @Override
    public void showAllProducts() {
        games.sort(Comparator.comparingLong(Game::getId));
        for (Game g: games) {
            System.out.println(g);
        }
    }
}
