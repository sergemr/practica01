package com.practica01.practica01;

class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String brand, String model, int batteryCapacity) {

        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println("Charging the " + getMake() + " " + getModel() + " with a battery capacity of "
                + batteryCapacity + " kWh.");
    }

    @Override
    public String getMake() {
        return "Este es electrico y su marca es" + super.getMake();
    }
}
