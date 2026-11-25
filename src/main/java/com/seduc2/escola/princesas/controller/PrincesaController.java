package com.seduc2.escola.princesas.controller;

import com.seduc2.escola.princesas.service.PrincesaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PrincesaController {

    private final PrincesaService service;
    public PrincesaController(PrincesaService service) {
        this.service = service;
    }

}
