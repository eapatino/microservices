package com.microservices.microservices.controller;


import com.microservices.microservices.controller.objects.Person;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "https://127.0.0.1:5500")
public class ControllerVehicle {
    @PostMapping("/sevicio/{dato}")
    public String consultarVehiculo(@PathVariable String dato){
        return "Bienvenido, no hay vehiculos"+dato;
    }

    @PostMapping("/services")
    public Person consultar(){
        Person p = new Person(1,"juan");
        return p;
    }

    @RequestMapping(value = "/services-test")
    public  String test(@RequestHeader(value="Accept-Language") String dato2){
        return "Return: "+ dato2;

    }


}
