package com.practica01.practica01;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class PracticaRESTController {

    @GetMapping("/etInfo")
    public String getMethodName() {
        Car myCar = new Car("Ford");

        return myCar.getBrandList().toString();
        // return myCar.getModel();

        // return "SomeData";
    }

}
