package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<House> evler = new ArrayList<>();
        evler.add(new House("123 Main St", 3, 1, 250000, 150));
        evler.add(new Villa("456 Oak Ave", 4, 2, 500000, 300));
        evler.add(new SummerHouse("789 Pine Rd", 2, 1, 150000, 120));

        HouseService evServis = new HouseService(evler);

        System.out.println("Total price of all houses: $" + evServis.totalPriceOfHouses());
        System.out.println("Total price of all villas: $" + evServis.totalPriceOfVillas());
        System.out.println("Total price of all summer houses: $" + evServis.totalPriceOfSummerHouses());
        System.out.println("Average area of all houses: " + evServis.averageAreaOfHouses() + " sqm");
        System.out.println("Average area of all villas: " + evServis.averageAreaOfVillas() + " sqm");
        System.out.println("Average area of all summer houses: " + evServis.averageAreaOfSummerHouses() + " sqm");

        int rooms = 3;
        int livingRooms = 1;
        List<House> filteredHouses = evServis.filterHousesByRooms(rooms, livingRooms);
        System.out.println("\nHouses with " + rooms + " rooms and " + livingRooms + " living room(s):");
        for (House ev : filteredHouses) {
            System.out.println("Address: " + ev.getAddress() + ", Price: $" + ev.getPrice());
        }
    }
}
