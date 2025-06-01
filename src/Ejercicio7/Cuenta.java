package Ejercicio7;

public class Cuenta {

    private String numero;
    private String titular;
    private double saldo;

    public Cuenta(String numero, String titular){
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public double getSaldo(){
        return saldo;
    }
    public String getTitular(){
        return titular;
    }
    public String getNumero(){
        return numero;
    }

    public void depositar(double saldoDepositado){
        if (saldoDepositado > 0){
            this.saldo += saldoDepositado;
            System.out.println("Se ha depositado: $" + saldoDepositado);
            System.out.println("Saldo actual: " + this.saldo);
        } else {
            System.out.println("El depósito debe ser mayor a 0 pesos");
        }

    }

    public void retirar(double saldoRetiro){
        if (saldoRetiro > saldo){
            System.out.println("No hay fondos suficientes para efectuar el retiro.");
        } else if (saldoRetiro <= 0) {
            System.out.println("El retiro debe ser mayor a 0.");
        } else {
            this.saldo -= saldoRetiro;
            System.out.println("Se ha retirado: $" + saldoRetiro);
            System.out.println("Saldo actual: " + this.saldo);
        }
    }
}