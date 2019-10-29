package com.helena;

// Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.
import java.util.ArrayList;
import java.util.List;

public class Payment_V5A2 {
    private int id;
    private String name;
    private int quantity;

    public Payment_V5A2(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;

        setId(id);
        setName(name);
        setQuantity(quantity);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return id + ") " + name + " в количестве " + quantity;
    }

    public static class BagArray {
        private List<Payment_V5A2> productList = new ArrayList<>();


        public void addProducts(Payment_V5A2 a) {
            productList.add(a);
        }

        public void showProducts() {
            System.out.println("Список покупок в корзине:");
            for (Payment_V5A2 product : productList) {
                System.out.println(product.toString());
            }
        }
        public void addProductToBag(String name) {
            for (Payment_V5A2 product : productList) {
                if(product.getName()==name) {
                    product.setQuantity(product.getQuantity()+1);
                }
            }
        }

    }

}
