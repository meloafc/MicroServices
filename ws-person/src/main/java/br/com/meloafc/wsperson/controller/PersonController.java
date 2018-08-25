package br.com.meloafc.wsperson.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/person")
public class PersonController {

    @RequestMapping(value = "/{name}")
    public String echoName(@PathVariable(name = "name") String name) {
        return name;
    }

}
