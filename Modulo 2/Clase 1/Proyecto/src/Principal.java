import java.util.ArrayList;

public class Principal {
   public static void main(String[] args) {
    
        //Crear libros con constructor parametrizado
        Libro libro1 = new Libro("1984", "George Orwell", "9780451524935", 35.5);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "9780307474728", 42.0);

        //Crear un libro con constructor vacío y luego usar setters
        Libro libro3 = new Libro();
        libro3.setTitulo("El Principito");
        libro3.setAutor("Antoine de Saint-Exupéry");
        libro3.setIsbn("9780156013987");
        libro3.setPrecio(28.0);

        //Mostrar cada libro individualmente usando toString()
        System.out.println(libro1); // Llama automáticamente al método toString()
        System.out.println(libro2);
        System.out.println(libro3);

        // Actualizar el precio de un libro
        libro3.actualizarPrecio(32.0);

        //Mostrar el precio con IVA de un libro
        System.out.println("Precio de '" + libro1.getTitulo() + "' con IVA: $" + libro1.obtenerPrecioConIVA());

        //Guardar libros en una lista
        ArrayList<Libro> listaLibros = new ArrayList<>();
        listaLibros.add(libro1);
        listaLibros.add(libro2);
        listaLibros.add(libro3);

        // Mostrar todos los libros usando for-each
        System.out.println("\nLista de libros:");
        for (Libro l : listaLibros) {
            System.out.println(l);
            System.out.println("Precio con IVA: $" + l.obtenerPrecioConIVA());
            System.out.println("---------------------------");
        }
    }
}
