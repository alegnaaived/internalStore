package com.todo1.internalStore.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KardexController {
    @PreAuthorize("hasAuthority('SCOPE_mod_custom')")
    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
}
