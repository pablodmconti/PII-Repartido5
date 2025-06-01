package Ejercicio8;

public class Main {
    public static void main(String[] args) {

        Empleado empleado = new Empleado ("Pablo Daniel", "Empleado", -1000);

        empleado.setSueldoBase(50000);
        empleado.setCargo("Jefe");

        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Cargo: " + empleado.getCargo());
        System.out.println("Sueldo base: " + empleado.getSueldoBase() + "$");
        System.out.println("Sueldo final: " + empleado.getSueldoFinal() + "$");

    }
}