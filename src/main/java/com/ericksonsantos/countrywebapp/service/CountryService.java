package com.ericksonsantos.countrywebapp.service;

import com.ericksonsantos.countrywebapp.data.Country;
import com.ericksonsantos.countrywebapp.data.CountrySummary;
import com.ericksonsantos.countrywebapp.data.ListCountries;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class CountryService {

    private final WebClient webClient;

    public CountryService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://localhost:8080").build();
    }

    public Flux<CountrySummary> getCountries() {
        Mono<ListCountries> countries = this.webClient.get().uri("/countries").retrieve()
                .bodyToMono(ListCountries.class);
        return countries.flatMapMany(x -> Flux.fromArray(x.getCountries()));
    }

    public Mono<Country> getCountry(String name) {
        return this.webClient.get().uri(uriBuilder -> uriBuilder.path("/countries/{name}")
                .build(name)).retrieve().bodyToMono(Country.class);
    }
}
