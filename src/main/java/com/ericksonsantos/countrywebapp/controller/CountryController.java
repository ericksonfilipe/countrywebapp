package com.ericksonsantos.countrywebapp.controller;


import com.ericksonsantos.countrywebapp.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.spring5.context.webflux.IReactiveDataDriverContextVariable;
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;

@Controller
public class CountryController {

    private CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @RequestMapping({"/", "/countries"})
    public String getAllCountries(final Model model) {
        final IReactiveDataDriverContextVariable reactiveDataDrivenMode = new ReactiveDataDriverContextVariable(
                countryService.getCountries(), 100);
        model.addAttribute("countries", reactiveDataDrivenMode);
        return "index";
    }

    @GetMapping("/countries/{name}")
    public String getCountry(@PathVariable(value="name") String name, final Model model) {
        final IReactiveDataDriverContextVariable reactiveDataDrivenMode = new ReactiveDataDriverContextVariable(
                countryService.getCountry(name).flux(), 100);
        model.addAttribute("country", reactiveDataDrivenMode);
        return "country";
    }
}
