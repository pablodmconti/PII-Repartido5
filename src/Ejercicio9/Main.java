package Ejercicio9;

public class Main {
    public static void main(String[] args) {

        Producto producto = new Producto ("PSN123", "Playstation 5", 5, -30000);

        producto.setPrecio(30000);

        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Codigo: " + producto.getCodigo());
        System.out.println("Stock: " + producto.getStock());
        System.out.println("Precio: " + producto.getPrecio() + "$");

        producto.vender(7);
        producto.vender(2);

        producto.reponer(5);

    }
}