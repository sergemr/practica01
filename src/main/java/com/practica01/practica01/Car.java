package com.practica01.practica01;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String brand;
    private String model;
    private String color;

    List<Car> carList = new ArrayList<Car>();
    List<String> brandList = new ArrayList<String>();

    public List<Car> getCarList() {
        Car ford = new Car("Ford", "Mustang", "Red");
        Car nissan = new Car("Nissan", "Sentra", "Black");
        Car toyota = new Car("Toyota", "Corolla", "White");

        carList.add(ford);
        carList.add(nissan);
        carList.add(toyota);

        for (Car car : carList) {
            System.out.println(car.getModel());
        }
        return carList;
    }

    public List<String> getBrandList() {

        brandList.add("Ford");
        brandList.add("Nissan");
        brandList.add("Toyota");

        for (int i = 0; i < brandList.size(); i++) {
            String str = brandList.get(i);
            System.out.println("Index " + i + ": " + str);
        }
        for (String brand : brandList) {
            System.out.println(brand);
        }
        brandList.remove("Toyota");
        brandList.remove(1);
        return brandList;
    }

    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return "This cars model is a " + this.model;
    }

}
