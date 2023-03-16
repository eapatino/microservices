package com.microservices.microservices.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerVehicle {
    @PostMapping("/sevicio/{dato}")
    public String consultarVehiculo(@PathVariable String dato){
        return "Bienvenido, no hay vehiculos"+dato;
    }
    @PostMapping("/services")
    public String consultar(){
        return "Bienvenido, no hay vehiculos";
    }

    @RequestMapping(value = "/services-test")
    public  String test(@RequestHeader(value="Accept-Language") String dato2){
        return "Return: "+ dato2;

    }


}
