package pl.makstokarz.shopGames;

import java.math.BigDecimal;

public class Game {
    private String name;
    private long id;
    private BigDecimal price;
    private int quantity;

    public Game(String name, long id, BigDecimal price, int quantity) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(int quantity){
        return quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
