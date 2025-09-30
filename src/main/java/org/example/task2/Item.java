package org.example.task2;

public class Item {
    private final long id;
    private final String name;
    private final double price;

    public Item(long id, String name, double price) {
        if (id <= 0) throw new IllegalArgumentException("id must be > 0");
        if (name == null || name.isBlank()) throw new IllegalArgumentException("name is required");
        if (price < 0) throw new IllegalArgumentException("price must be >= 0");
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public long getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override public String toString() {
        return "Item{id=" + id + ", name='" + name + "', price=" + price + '}';
    }
}
