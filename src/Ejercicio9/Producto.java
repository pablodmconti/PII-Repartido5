package Ejercicio9;

public class Producto {
    private String codigo;
    private String nombre;
    private int stock;
    private double precio;

    public Producto (String codigo, String nombre, int stock, double precio){
        this.codigo = codigo;
        this.nombre = nombre;
        if (stock >= 0){
            this.stock = stock;
        }else {
            System.out.println("Error: El stock no puede ser menor a cero");
        }
        if (precio > 0){
            this.precio = precio;
        }else {
            System.out.println("Error: El precio debe ser mayor a cero");
        }
        System.out.println("Producto creado: " + codigo + " - " + nombre);
    }

    //Metodo que descuenta  stock en caso de haber suficiente
    public void vender(int cantidad){
        if (stock >= cantidad){
            this.stock -= cantidad;
            System.out.println("Stock actual: " + stock);
        }else {
            System.out.println("Error: No hay suficiente cantidad de producto en stock");
        }
    }

    public void reponer (int cantidad){
        if (cantidad >= 0){
            this.stock += cantidad;
            System.out.println("Stock actual: " + stock);
        }else {
            System.out.println("La cantidad a reponer debe ser mayor a cero");
        }
    }

    public int getStock(){
        return stock;
    }

    public double getPrecio(){
        return precio;
    }

    public String getNombre (){
        return nombre;
    }

    public String getCodigo(){
        return codigo;
    }

    public void setPrecio(double nuevoPrecio){
        if (nuevoPrecio > 0) {
            this.precio = nuevoPrecio;
        }else{
            System.out.println("Error: El precio debe ser mayor a cero");
        }
    }
}