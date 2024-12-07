package org.example.models;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    public String getHealthyExtra1Name() {
        return healthyExtra1Name;
    }

    public double getHealthyExtra1Price() {
        return healthyExtra1Price;
    }

    public String getHealthyExtra2Name() {
        return healthyExtra2Name;
    }

    public double getHealthyExtra2Price() {
        return healthyExtra2Price;
    }

    @Override
    public double itemizeHamburger() {

        double totalPrice = super.itemizeHamburger();

        if (this.healthyExtra1Name != null) {
            System.out.println("Healthy Extra 1: " + this.healthyExtra1Name);
            totalPrice += this.healthyExtra1Price;
        }

        if (this.healthyExtra2Name != null) {
            System.out.println("Healthy Extra 2: " + this.healthyExtra2Name );
            totalPrice += this.healthyExtra2Price;
        }

        return totalPrice;
    }
    @Override
    public double getPrice() {
        return this.itemizeHamburger();
    }

}