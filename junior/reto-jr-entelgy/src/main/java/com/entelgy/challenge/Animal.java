package com.entelgy.challenge;

public abstract class Animal {

    protected String nombre;
    protected int edad;
    protected String raza;
    protected int tiempoVida;
    protected String tipo;

    public Animal(String nombre, int edad, String raza, int tiempoVida, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tiempoVida = tiempoVida;
        this.tipo = tipo;
    }

    public Animal() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getTiempoVida() {
        return tiempoVida;
    }

    public void setTiempoVida(int tiempoVida) {
        this.tiempoVida = tiempoVida;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public abstract String realizarSonido();

    public abstract void describir();

}
