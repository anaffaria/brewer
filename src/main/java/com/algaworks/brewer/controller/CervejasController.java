package com.algaworks.brewer.controller;

import ch.qos.logback.core.db.dialect.SybaseSqlAnywhereDialect;
import com.algaworks.brewer.model.Cerveja;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CervejasController {

    @RequestMapping("/cervejas/novo")
    public String novo(){
        return "cerveja/CadastroCerveja";
    }

    @RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
    public String cadastrar(Cerveja cerveja){
        System.out.println("sku: " + cerveja.getSku());
        return "cerveja/CadastroCerveja";
    }

}
