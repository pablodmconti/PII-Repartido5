package Ejercicio6;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Elden Ring", "Hidetaka Miyazaki", 2026);
        System.out.println(libro1.getTitulo() + " : " + libro1.getAutor() + " : " + libro1.getAnio());
        libro1.setTitulo("La metamorfosis");
        libro1.setAutor("Frank Kafka");
        libro1.setAnio(2026);
        libro1.setAnio(1915);
        System.out.println(libro1.getTitulo() + " : " + libro1.getAutor() + " : " + libro1.getAnio());

    }
}