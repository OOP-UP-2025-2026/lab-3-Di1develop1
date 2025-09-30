package org.example.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cart {
    private final List<Item> items = new ArrayList<>();

    public void add(Item item) {
        if (item == null) throw new IllegalArgumentException("item is null");
        items.add(item);
    }

    public boolean removeById(long id) {
        Iterator<Item> it = items.iterator();
        while (it.hasNext()) {
            if (it.next().getId() == id) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public int size() { return items.size(); }

    public double total() {
        double sum = 0.0;
        for (Item i : items) sum += i.getPrice();
        return sum;
    }

    public List<Item> getItems() {
        return List.copyOf(items);
    }

    @Override public String toString() {
        return "Cart{items=" + items + "}";
    }
}
