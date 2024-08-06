package org.example;

import java.io.PrintStream;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Purchase> list = new ArrayList<>();
        Client client1 = new Client("Dupond", "Jean", LocalDate.of(1990, 3, 12));
        Client client2 = new Client("Dupont", "Benoit", LocalDate.of(2001, 8, 31));
        Purchase purchase1 = new Purchase(client1, "Savon", 3, LocalDate.of(2024, 8, 1));
        Purchase purchase2 = new Purchase(client1, "Serviette", 1, LocalDate.of(2024, 8, 1));
        Purchase purchase3 = new Purchase(client1, "Baguette", 4, LocalDate.of(2024, 8, 1));
        Purchase purchase4 = new Purchase(client1, "Baguette", 6, LocalDate.of(2024, 8, 4));
        Purchase purchase5 = new Purchase(client2, "Piles", 1, LocalDate.of(2024, 8, 4));

        list.add(purchase1);
        list.add(purchase2);
        list.add(purchase3);
        list.add(purchase4);
        list.add(purchase5);

        Map<String, Purchase> map = new HashMap<>();

        for (Purchase purchase : list) {
            if (map.containsKey(purchase.getProduct())) {
                Purchase existingPurchase = map.get(purchase.getProduct());
                existingPurchase.setQuantity(existingPurchase.getQuantity() + purchase.getQuantity());
            } else {
                map.put(purchase.getProduct(), purchase);
            }
        }

        for (Purchase purchase : map.values()) {
            System.out.println(purchase.getClient().getLastName() + " " + purchase.getClient().getFirstName() + " - " + purchase.getProduct() + " " + purchase.getQuantity());
        }
    }
}