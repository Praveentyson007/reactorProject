package org.reactive.java;


import reactor.core.publisher.Flux;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Flux<String> stringFlux = Flux.just("hello", "welcome", "hiiii");
        stringFlux.subscribe(System.out::println);
    }

}
