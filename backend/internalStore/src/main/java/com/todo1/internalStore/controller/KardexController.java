package com.todo1.internalStore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KardexController {
    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
}
