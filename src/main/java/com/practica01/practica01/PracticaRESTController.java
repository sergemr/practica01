package com.practica01.practica01;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class PracticaRESTController {

    @GetMapping("/getInfo")
    public String getMethodName() {
        Car myCar = new Car("Ford");
        myCar.getAddCarToList(myCar);
        return myCar.getCarList().toString();
        // return myCar.getBrandList().toString();
        // return myCar.getModel();

        // return "SomeData";
    }

    @GetMapping("/getInfoArray")
    public String getCars() {
        Car myCar = new Car("Ford");

        return myCar.getCars().toString();
        // return myCar.getBrandList().toString();
        // return myCar.getModel();

        // return "SomeData";
    }

    @GetMapping("/removeToyota")
    public String getRemove() {
        Car myCar = new Car("Ford");
        myCar.getBrandList();
        // myCar.removeBrandIndex();
        return myCar.removeBrandIndex().toString();
        // return myCar.getBrandList().toString();
        // return myCar.getModel();

        // return "SomeData";
    }

    @GetMapping("/updateCar")
    public String carUpdate() {
        Car myCar = new Car("Tesla");
        myCar.getBrandList();
        // myCar.removeBrandIndex();
        myCar.getCarList();
        return myCar.updateCarInList(myCar, 1).toString();
        // return myCar.getBrandList().toString();
        // return myCar.getModel();

        // return "SomeData";
    }

    @PostMapping("/postInfo")
    public String postMethodName(@RequestParam String name, @RequestParam String lastName) {
        return "Hello " + name + " " + lastName;
    }

}
