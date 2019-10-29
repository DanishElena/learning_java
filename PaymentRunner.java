package com.helena;

public class PaymentRunner {
    public static void main(String[] args)  {

        Payment_V5A2 note1 = new Payment_V5A2(1, "Пицца", 1);
        Payment_V5A2 note2 = new Payment_V5A2(2, "Роллы", 1);
        Payment_V5A2 note3 = new Payment_V5A2(3, "Бельгийская вафля", 1);
        Payment_V5A2 note4 = new Payment_V5A2(4, "Шашлык", 1);
        Payment_V5A2 note5 = new Payment_V5A2(5, "Салат", 1);
        Payment_V5A2 note6 = new Payment_V5A2(6, "Паста", 1);
        Payment_V5A2 note7 = new Payment_V5A2(7, "Кофе", 1);

        Payment_V5A2.BagArray products = new Payment_V5A2.BagArray();
        products.addProducts(note1);
        products.addProducts(note2);
        products.addProducts(note3);
        products.addProducts(note4);
        products.addProducts(note5);
        products.addProducts(note6);
        products.addProducts(note7);

        products.addProductToBag("Кофе");
        products.addProductToBag("Шашлык");
        products.showProducts();



}
}

