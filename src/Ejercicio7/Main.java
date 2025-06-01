package Ejercicio7;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("1234567890", "Pablo Daniel");

        System.out.println("Número de cuenta: " + cuenta.getNumero());
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo: " + cuenta.getSaldo());

        cuenta.depositar(10000.50);
        cuenta.retirar(9000);
    }
}