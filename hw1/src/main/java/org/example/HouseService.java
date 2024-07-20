package org.example;

import java.util.ArrayList;
import java.util.List;

class HouseService {
    private List<House> evList;
    public HouseService(List<House> evList) {
        this.evList = evList;
    }
    public List<House> getEvList() {
        List<House> houses = new ArrayList<>();
        for (House ev : evList) {
            if (ev instanceof House) {
                houses.add(ev);
            }
        }
        return houses;
    }
    public List<Villa> getVillaList() {
        List<Villa> villas = new ArrayList<>();
        for (House ev : evList) {
            if (ev instanceof Villa) {
                villas.add((Villa) ev);
            }
        }
        return villas;
    }
    public List<SummerHouse> getSummerHouseList() {
        List<SummerHouse> summerHouses = new ArrayList<>();
        for (House ev : evList) {
            if (ev instanceof SummerHouse) {
                summerHouses.add((SummerHouse) ev);
            }
        }
        return summerHouses;
    }
    public double totalPriceOfHouses() {
        double totalPrice = 0;
        for (House ev : evList) {
            totalPrice += ev.getPrice();
        }
        return totalPrice;
    }
    public double totalPriceOfVillas() {
        double totalPrice = 0;
        for (Villa villa : getVillaList()) {
            totalPrice += villa.getPrice();
        }
        return totalPrice;
    }
    public double totalPriceOfSummerHouses() {
        double totalPrice = 0;
        for (SummerHouse summerHouse : getSummerHouseList()) {
            totalPrice += summerHouse.getPrice();
        }
        return totalPrice;
    }
    public double averageAreaOfHouses() {
        double totalArea = 0;
        for (House ev : evList) {
            totalArea += ev.getArea();
        }
        return evList.isEmpty() ? 0 : totalArea / evList.size();
    }
    public double averageAreaOfVillas() {
        List<Villa> villas = getVillaList();
        double totalArea = 0;
        for (Villa villa : villas) {
            totalArea += villa.getArea();
        }
        return villas.isEmpty() ? 0 : totalArea / villas.size();
    }
    public double averageAreaOfSummerHouses() {
        List<SummerHouse> summerHouses = getSummerHouseList();
        double totalArea = 0;
        for (SummerHouse summerHouse : summerHouses) {
            totalArea += summerHouse.getArea();
        }
        return summerHouses.isEmpty() ? 0 : totalArea / summerHouses.size();
    }
    public double averageAreaOfAllHouses() {
        double totalArea = 0;
        for (House ev : evList) {
            totalArea += ev.getArea();
        }
        return evList.isEmpty() ? 0 : totalArea / evList.size();
    }
    public List<House> filterHousesByRooms(int numberOfRooms, int numberOfLivingRooms) {
        List<House> filteredHouses = new ArrayList<>();
        for (House ev : evList) {
            if (ev.getNumberOfRooms() == numberOfRooms && ev.getNumberOfLivingRooms() == numberOfLivingRooms) {
                filteredHouses.add(ev);
            }
        }
        return filteredHouses;
    }
}

