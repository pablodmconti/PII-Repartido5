package Ejercicio8;

public class Empleado {
    private String nombre;
    private String cargo;
    private double sueldoBase;

    // Constructor con validacion del sueldo base
    public Empleado(String nombre, String cargo, double sueldoBase) {
        this.nombre = nombre;
        this.cargo = cargo;

        if (sueldoBase < 0) {
            System.out.println("Error: El sueldo base no puede ser negativo.");
            this.sueldoBase = 0;
        } else {
            this.sueldoBase = sueldoBase;
        }

        System.out.println("Empleado creado: " + nombre + " - Cargo: " + cargo);
    }

    // calcula el sueldo final con aumento del 20% en caso de que sea jefe
    public double getSueldoFinal() {
        if (cargo.equals("Jefe")) {
            return sueldoBase * 1.20;
        } else {
            return sueldoBase;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        if (sueldoBase < 0) {
            System.out.println("Error: El sueldo base no puede ser negativo.");
        } else {
            this.sueldoBase = sueldoBase;
        }
    }
}