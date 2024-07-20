package org.example;

class House {
    private String address;
    private int numberOfRooms;
    private int numberOfLivingRooms;
    private double price;
    private double area;

    public House(String address, int numberOfRooms, int numberOfLivingRooms, double price, double area) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.numberOfLivingRooms = numberOfLivingRooms;
        this.price = price;
        this.area = area;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void setNumberOfLivingRooms(int numberOfLivingRooms) {
        this.numberOfLivingRooms = numberOfLivingRooms;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfLivingRooms() {
        return numberOfLivingRooms;
    }

    public double getPrice() {
        return price;
    }

    public double getArea() {
        return area;
    }
}
class Villa extends House {
    public Villa(String address, int numberOfRooms, int numberOfLivingRooms, double price, double area) {
        super(address, numberOfRooms, numberOfLivingRooms, price, area);
    }
}
class SummerHouse extends House {
    public SummerHouse(String address, int numberOfRooms, int numberOfLivingRooms, double price, double area) {
        super(address, numberOfRooms, numberOfLivingRooms, price, area);
    }
}
