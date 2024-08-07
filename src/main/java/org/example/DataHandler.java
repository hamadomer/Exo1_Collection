package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataHandler {

    public static Map<Client, Map<String, Integer>> dataTreatement (List<Purchase> list) {
        Map<Client, Map<String, Integer>> map = new HashMap<>();

        for (Purchase purchase : list) {
            if (!map.containsKey(purchase.getClient())) {
                map.put(purchase.getClient(), new HashMap<>());
            }

            Map<String, Integer> clientPurchases = map.get(purchase.getClient());
            if (clientPurchases.containsKey(purchase.getProduct())) {
                clientPurchases.put(purchase.getProduct(), clientPurchases.get(purchase.getProduct()) + purchase.getQuantity());
            } else {
                clientPurchases.put(purchase.getProduct(), purchase.getQuantity());
            }
        }
        return map;
    }
}
