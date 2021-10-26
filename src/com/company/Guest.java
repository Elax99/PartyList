package com.company;


public class Guest {
    private String name;
    private String meal;
    private int phoneNumber;
    private boolean isVegan;

    public Guest(String name, String meal, int phoneNumber, boolean isVegan) {
        this.name = name;
        this.meal = meal;
        this.phoneNumber = phoneNumber;
        this.isVegan = isVegan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    public String getName() {
        return name;
    }

    public String getMeal() {
        return meal;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void displayGuestInformation() {
        System.out.println("Imie: " + name);
        System.out.println("Preferowany posiłek: " + meal);
        System.out.println("Numer telefonu: " + phoneNumber);
        String isVeganString = isVegan ? "tak" : "nie";
        System.out.println("Wganin? " + isVeganString);

    }
}
