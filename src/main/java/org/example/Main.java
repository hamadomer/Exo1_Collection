package org.example;

import java.io.PrintStream;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Purchase> list = new ArrayList<>();

        Purchase purchase1 = new Purchase(new Client("Dupond", "Jean", LocalDate.of(1990, 3, 12)), "Savon", 3, LocalDate.of(2024, 8, 1));
        Purchase purchase2 = new Purchase(new Client("Dupond", "Jean", LocalDate.of(1990, 3, 12)), "Serviette", 1, LocalDate.of(2024, 8, 1));
        Purchase purchase3 = new Purchase(new Client("Dupond", "Jean", LocalDate.of(1990, 3, 12)), "Baguette", 4, LocalDate.of(2024, 8, 1));
        Purchase purchase4 = new Purchase(new Client("Dupond", "Jean", LocalDate.of(1990, 3, 12)), "Baguette", 6, LocalDate.of(2024, 8, 4));
        Purchase purchase5 = new Purchase(new Client("Dupont", "Benoit", LocalDate.of(2001, 8, 31)), "Piles", 1, LocalDate.of(2024, 8, 4));
        Purchase purchase6 = new Purchase(new Client("Dupont", "Benoit", LocalDate.of(2001, 8, 31)), "Baguette", 3, LocalDate.of(2024, 8, 4));

        list.add(purchase1);
        list.add(purchase2);
        list.add(purchase3);
        list.add(purchase4);
        list.add(purchase5);
        list.add(purchase6);

        System.out.println(DataHandler.dataTreatement(list).get(new Client("Dupont", "Benoit", LocalDate.of(2001, 8, 31))));
    }
}