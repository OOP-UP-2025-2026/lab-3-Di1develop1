package org.example.task2;

public class Main {
    public static void main(String[] args) {
        // Box demo
        Box box = new Box(2, 3, 4);
        System.out.println("Surface: " + box.getSurfaceArea());
        System.out.println("Lateral: " + box.getLateralSurfaceArea());
        System.out.println("Volume:  " + box.getVolume());

        // Cart + Order demo
        Cart cart = new Cart();
        cart.add(new Item(1, "Phone", 5000));
        cart.add(new Item(2, "Laptop", 12000));
        cart.removeById(1);
        Order order = new Order(101, "Anna");
        System.out.println(order.formOrderBill(cart));

        // IntStack demo
        IntStack st = new IntStack();
        st.push(10); st.push(20);
        System.out.println("peek = " + st.peek()); // 20
        System.out.println("pop  = " + st.pop());  // 20
        System.out.println("size = " + st.size()); // 1
    }
}
