package com.entelgy.challenge;

public class Reporte {
    public static Animal[] cargarDatosAnimale() {
        //El método “cargar datos” deberá crear 3 objetos de cada animal.
        Perro perro1 = new Perro("perro1", 5, "raza1", 15);
        Perro perro2 = new Perro("perro2", 3, "raza2", 12);
        Perro perro3 = new Perro("perro3", 4, "raza3", 10);

        Gato gato1 = new Gato("gato1", 2, "razagato1", 18);
        Gato gato2 = new Gato("gato2", 4, "razagato2", 16);
        Gato gato3 = new Gato("gato3", 6, "razagato3", 14);

        Vaca vaca1 = new Vaca("vaca1", 7, "razavaca1", 20);
        Vaca vaca2 = new Vaca("vaca2", 5, "razavaca2", 18);
        Vaca vaca3 = new Vaca("vaca3", 9, "razavaca3", 22);

        //Devolviendo así un array de tipo “Animal” de 9 elementos.
        return new Animal[]{perro1, perro2, perro3, gato1, gato2, gato3, vaca1, vaca2, vaca3};
    }
    //El método “principal” inicialmente deberá llamar al método “cargar datos”
    public static void main(String[] args) {

        Animal[] animales = cargarDatosAnimale();

        String nombreBuscado = "vaca3";
        boolean encontrado = false;
        for (Animal animal : animales) {
            if (animal.getNombre().equals(nombreBuscado)) {
                animal.describir();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            throw new RuntimeException("animal no encontrado");
        }
    }
}
