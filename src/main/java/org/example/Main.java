package org.example;

import animais.Animal;

public class Main {
    public static void main(String[] args) {

        Animal animal = Animal.builder()
                .nome("Dog")
                .dono("Junior")
                .raca("Pitbull")
                .build();
        System.out.println(animal);

    }
}