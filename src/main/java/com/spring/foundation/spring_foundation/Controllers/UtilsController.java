package com.spring.foundation.spring_foundation.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
public class UtilsController {

    @GetMapping("/getTable")
    public List<String> getTable() {
        List<String> strings = new LinkedList<>();

        strings.add("yigal");
        strings.add("shiran");
        strings.add("saar");
        strings.add("burko");
        strings.add("eran");
        return strings;
    }

    @GetMapping("/saveUserToDb")
    public void saveUserToDb(@RequestParam(name = "name") String name, @RequestParam(name = "email") String email){
        System.out.println("asdasda");
    }

}
