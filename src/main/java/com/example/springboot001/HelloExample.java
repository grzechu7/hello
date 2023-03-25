package com.example.springboot001;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // prosty web serwis do przegladarki
class HelloExample {
    @RequestMapping("/") // strona główna witryny
    public String hello(){
        return "hello word";
    }

    @RequestMapping("/greeting")// localhost:8080/greeting?name=Ania
    public String helloAgain(@RequestParam(value = "name",
            defaultValue = "User") String name){
        return "Hello " + name;
    }

}
