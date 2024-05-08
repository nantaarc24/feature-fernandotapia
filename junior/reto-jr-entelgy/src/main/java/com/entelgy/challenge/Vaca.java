package com.entelgy.challenge;

public class Vaca extends Animal{

    public Vaca(String nombre, int edad, String raza, int tiempoDeVida) {
        super(nombre, edad, raza, tiempoDeVida, "Vaca");
    }

    @Override
    public String realizarSonido() {
        return "Mugir";
    }

    @Override
    public void describir() {
        System.out.println(nombre + " es un " + tipo + " de raza " + raza + " que tiene " + edad + " de edad. Siempre "+ realizarSonido() + " cuando está feliz. Su expectativa de vida es de " + tiempoVida + " años.");    }
}
