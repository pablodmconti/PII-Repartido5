    package Ejercicio5;

    public class Persona {

        private String nombre;
        private int edad;

        public Persona(String nombre, int edad){
            this.nombre = nombre;
            this.edad = edad;
            System.out.println("Persona creada: " + nombre);
        }

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setNombre(String nuevoNombre){
            this.nombre = nuevoNombre;
        }

        public void setEdad(int nuevaEdad){
            this.edad = nuevaEdad;
        }

    }
