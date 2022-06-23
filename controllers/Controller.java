package com.example.carapp.controllers;

//adding libraries to your class
import com.example.carapp.model.Car;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Controller {

@RequestMapping(value= "/cars" , method= RequestMethod.GET)
public List<Car> getCars(Model model){
    List<Car>carList=new ArrayList<Car>();

    carList.add(new Car("Acura", "RDX" , 50000.00f, "Gray" , 60000.0f));
    carList.add(new Car("Acura", "MDX", 69000.00f, "White", 10000.0f));
    carList.add(new Car("Mazda", "CX5",37000.0f,"Metallic Blue",15000.0f ));
    carList.add(new Car("Mazda", "CX9",50000.0f,"White",12000.0f));

    return carList;
}
}

