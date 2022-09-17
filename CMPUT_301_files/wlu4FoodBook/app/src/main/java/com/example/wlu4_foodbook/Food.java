package com.example.wlu4_foodbook;

import java.util.Date;

public class Food {
    private String BB;//best before date
    private String description;//food name
    private int location; //1 2 3 location (choice of pantry, freezer, or fridge)
    private int count;//make sure postive
    private int unitCost;//make sure postive


    public Food(String BB, String description, int location, int count, int unitCost) {
        this.BB = BB;
        this.description = description;
        this.location = location;
        this.count = count;
        this.unitCost = unitCost;
    }

    public String getBB() {
        return BB;
    }

    public String getDescription() {
        return description;
    }

    public int getLocation() {
        return location;
    }

    public int getCount() {
        return count;
    }

    public int getUnitCost() {
        return unitCost;
    }
}
