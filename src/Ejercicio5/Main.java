package Ejercicio5;

public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Franco", 18);
        System.out.println(persona1.getNombre() + " tiene " + persona1.getEdad() + " años.");
        persona1.setNombre("Araceli");
        persona1.setEdad(16);
        System.out.println(persona1.getNombre() + " tiene " + persona1.getEdad() + " años.");
    }
}
